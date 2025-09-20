package com.awesomeapp.postnetwork

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.commentpost.Api500_6
import com.awesomeapp.pushsearch.Api540_6
import com.awesomeapp.photosearch.Api584_6
import com.awesomeapp.accountsearch.Api560_6
import com.awesomeapp.notificationcomment.Api460_6


@Singleton
class Repository648_5 @Inject constructor(
    private val api0: Api500_6,
    private val api1: Api540_6,
    private val api2: Api584_6,
    private val api3: Api560_6,
    private val api4: Api460_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}