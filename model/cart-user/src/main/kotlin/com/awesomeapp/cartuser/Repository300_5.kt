package com.awesomeapp.cartuser

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.forecastcheckout.Api236_6


@Singleton
class Repository300_5 @Inject constructor(
    private val api0: Api212_6,
    private val api1: Api264_6,
    private val api2: Api268_6,
    private val api3: Api260_6,
    private val api4: Api216_6,
    private val api5: Api224_6,
    private val api6: Api272_6,
    private val api7: Api236_6
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