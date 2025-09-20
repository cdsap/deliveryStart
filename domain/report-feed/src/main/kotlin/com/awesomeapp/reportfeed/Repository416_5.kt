package com.awesomeapp.reportfeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.playlistidentity.Api196_6


@Singleton
class Repository416_5 @Inject constructor(
    private val api0: Api300_6,
    private val api1: Api152_6,
    private val api2: Api244_6,
    private val api3: Api272_6,
    private val api4: Api260_6,
    private val api5: Api208_6,
    private val api6: Api204_6,
    private val api7: Api196_6
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