package com.awesomeapp.notificationcart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.sessionlogin.Api120_6


@Singleton
class Repository264_5 @Inject constructor(
    private val api0: Api76_6,
    private val api1: Api104_6,
    private val api2: Api56_6,
    private val api3: Api72_6,
    private val api4: Api24_6,
    private val api5: Api68_6,
    private val api6: Api120_6
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
                        { api6.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}