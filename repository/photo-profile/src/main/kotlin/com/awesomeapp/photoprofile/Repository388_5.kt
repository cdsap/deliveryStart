package com.awesomeapp.photoprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.todocheckout.Api232_6


@Singleton
class Repository388_5 @Inject constructor(
    private val api0: Api236_6,
    private val api1: Api308_6,
    private val api2: Api248_6,
    private val api3: Api228_6,
    private val api4: Api276_6,
    private val api5: Api292_6,
    private val api6: Api232_6
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