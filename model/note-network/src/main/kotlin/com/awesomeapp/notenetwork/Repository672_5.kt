package com.awesomeapp.notenetwork

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.messagepost.Api508_6
import com.awesomeapp.metriccomment.Api468_6
import com.awesomeapp.commentpost.Api500_6
import com.awesomeapp.searchlocation.Api600_6
import com.awesomeapp.documentpost.Api524_6


@Singleton
class Repository672_5 @Inject constructor(
    private val api0: Api508_6,
    private val api1: Api468_6,
    private val api2: Api500_6,
    private val api3: Api600_6,
    private val api4: Api524_6
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