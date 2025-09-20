package com.awesomeapp.statuspost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.videofeed.Api436_6


@Singleton
class Repository516_5 @Inject constructor(
    private val api0: Api400_6,
    private val api1: Api384_6,
    private val api2: Api392_6,
    private val api3: Api336_6,
    private val api4: Api432_6,
    private val api5: Api404_6,
    private val api6: Api408_6,
    private val api7: Api436_6
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