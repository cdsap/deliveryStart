package com.awesomeapp.reportcheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.accountidentity.Api168_6


@Singleton
class Repository220_5 @Inject constructor(
    private val api0: Api208_6,
    private val api1: Api152_6,
    private val api2: Api164_6,
    private val api3: Api148_6,
    private val api4: Api156_6,
    private val api5: Api204_6,
    private val api6: Api168_6
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