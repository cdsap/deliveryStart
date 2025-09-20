package com.awesomeapp.eventpost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.settingfeed.Api412_6


@Singleton
class Repository520_5 @Inject constructor(
    private val api0: Api440_6,
    private val api1: Api364_6,
    private val api2: Api332_6,
    private val api3: Api376_6,
    private val api4: Api388_6,
    private val api5: Api392_6,
    private val api6: Api380_6,
    private val api7: Api412_6
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