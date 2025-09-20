package com.awesomeapp.feedprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.postcart.Api256_6


@Singleton
class Repository352_5 @Inject constructor(
    private val api0: Api280_6,
    private val api1: Api304_6,
    private val api2: Api232_6,
    private val api3: Api276_6,
    private val api4: Api224_6,
    private val api5: Api256_6
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