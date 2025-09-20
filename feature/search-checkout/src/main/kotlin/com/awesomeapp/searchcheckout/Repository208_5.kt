package com.awesomeapp.searchcheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.report.Api24_6


@Singleton
class Repository208_5 @Inject constructor(
    private val api0: Api48_6,
    private val api1: Api52_6,
    private val api2: Api108_6,
    private val api3: Api40_6,
    private val api4: Api72_6,
    private val api5: Api64_6,
    private val api6: Api20_6,
    private val api7: Api24_6
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