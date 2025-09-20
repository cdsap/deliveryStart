package com.awesomeapp.synccart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.report.Api24_6


@Singleton
class Repository260_5 @Inject constructor(
    private val api0: Api132_6,
    private val api1: Api56_6,
    private val api2: Api20_6,
    private val api3: Api68_6,
    private val api4: Api108_6,
    private val api5: Api24_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}