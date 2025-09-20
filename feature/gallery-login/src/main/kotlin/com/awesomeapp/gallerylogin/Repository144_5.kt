package com.awesomeapp.gallerylogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.forecast.Api40_6


@Singleton
class Repository144_5 @Inject constructor(
    private val api0: Api8_6,
    private val api1: Api108_6,
    private val api2: Api24_6,
    private val api3: Api60_6,
    private val api4: Api92_6,
    private val api5: Api32_6,
    private val api6: Api104_6,
    private val api7: Api76_6,
    private val api8: Api36_6,
    private val api9: Api100_6,
    private val api10: Api20_6,
    private val api11: Api40_6
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
                        { api11.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}