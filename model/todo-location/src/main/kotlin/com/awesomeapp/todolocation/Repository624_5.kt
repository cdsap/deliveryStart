package com.awesomeapp.todolocation

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.documentpost.Api524_6
import com.awesomeapp.newssearch.Api580_6
import com.awesomeapp.mediacomment.Api488_6
import com.awesomeapp.feedsearch.Api548_6
import com.awesomeapp.listsearch.Api576_6
import com.awesomeapp.synccomment.Api456_6


@Singleton
class Repository624_5 @Inject constructor(
    private val api0: Api524_6,
    private val api1: Api580_6,
    private val api2: Api488_6,
    private val api3: Api548_6,
    private val api4: Api576_6,
    private val api5: Api456_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}