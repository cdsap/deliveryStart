package com.awesomeapp.taskcheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.eventlogin.Api128_6


@Singleton
class Repository224_5 @Inject constructor(
    private val api0: Api52_6,
    private val api1: Api136_6,
    private val api2: Api112_6,
    private val api3: Api108_6,
    private val api4: Api20_6,
    private val api5: Api132_6,
    private val api6: Api84_6,
    private val api7: Api8_6,
    private val api8: Api68_6,
    private val api9: Api40_6,
    private val api10: Api80_6,
    private val api11: Api128_6
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