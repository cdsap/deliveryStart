package com.awesomeapp.podcastcomment

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.articleuser.Api336_6


@Singleton
class Repository484_5 @Inject constructor(
    private val api0: Api352_6,
    private val api1: Api396_6,
    private val api2: Api380_6,
    private val api3: Api428_6,
    private val api4: Api368_6,
    private val api5: Api336_6
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