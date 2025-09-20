package com.awesomeapp.statussync

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.groupsearch.Api556_6
import com.awesomeapp.metriccomment.Api468_6
import com.awesomeapp.postcomment.Api452_6
import com.awesomeapp.podcastcomment.Api484_6
import com.awesomeapp.analyticscomment.Api464_6
import com.awesomeapp.photosearch.Api584_6
import com.awesomeapp.identitylocation.Api592_6
import com.awesomeapp.eventpost.Api520_6


@Singleton
class Repository712_5 @Inject constructor(
    private val api0: Api556_6,
    private val api1: Api468_6,
    private val api2: Api452_6,
    private val api3: Api484_6,
    private val api4: Api464_6,
    private val api5: Api584_6,
    private val api6: Api592_6,
    private val api7: Api520_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() },
                        { api6.fetchData() },
                        { api7.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}