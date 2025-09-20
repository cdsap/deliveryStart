package com.awesomeapp.timerfeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.sessionuser.Api316_6


@Singleton
class Repository424_5 @Inject constructor(
    private val api0: Api252_6,
    private val api1: Api276_6,
    private val api2: Api320_6,
    private val api3: Api264_6,
    private val api4: Api260_6,
    private val api5: Api316_6
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