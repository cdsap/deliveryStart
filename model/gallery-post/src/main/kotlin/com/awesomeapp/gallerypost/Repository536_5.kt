package com.awesomeapp.gallerypost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.taskfeed.Api420_6


@Singleton
class Repository536_5 @Inject constructor(
    private val api0: Api384_6,
    private val api1: Api380_6,
    private val api2: Api404_6,
    private val api3: Api428_6,
    private val api4: Api352_6,
    private val api5: Api392_6,
    private val api6: Api364_6,
    private val api7: Api360_6,
    private val api8: Api420_6
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
                        { api7.fetchData() },
                        { api8.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}