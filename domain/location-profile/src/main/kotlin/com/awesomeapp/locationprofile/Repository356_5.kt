package com.awesomeapp.locationprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.logidentity.Api172_6


@Singleton
class Repository356_5 @Inject constructor(
    private val api0: Api228_6,
    private val api1: Api240_6,
    private val api2: Api212_6,
    private val api3: Api280_6,
    private val api4: Api168_6,
    private val api5: Api164_6,
    private val api6: Api172_6
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