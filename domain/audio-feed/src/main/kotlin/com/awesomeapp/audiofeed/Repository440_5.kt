package com.awesomeapp.audiofeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.locationidentity.Api160_6


@Singleton
class Repository440_5 @Inject constructor(
    private val api0: Api220_6,
    private val api1: Api244_6,
    private val api2: Api196_6,
    private val api3: Api172_6,
    private val api4: Api252_6,
    private val api5: Api276_6,
    private val api6: Api240_6,
    private val api7: Api236_6,
    private val api8: Api160_6
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