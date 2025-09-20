package com.awesomeapp.gallerypost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.usercomment.Api448_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.pushprofile.Api344_6


@Singleton
class Repository536_5 @Inject constructor(
    private val api0: Api448_6,
    private val api1: Api368_6,
    private val api2: Api404_6,
    private val api3: Api380_6,
    private val api4: Api420_6,
    private val api5: Api392_6,
    private val api6: Api320_6,
    private val api7: Api408_6,
    private val api8: Api364_6,
    private val api9: Api412_6,
    private val api10: Api332_6,
    private val api11: Api308_6,
    private val api12: Api432_6,
    private val api13: Api344_6
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
                        { api8.fetchData() },
                        { api9.fetchData() },
                        { api10.fetchData() },
                        { api11.fetchData() },
                        { api12.fetchData() },
                        { api13.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}