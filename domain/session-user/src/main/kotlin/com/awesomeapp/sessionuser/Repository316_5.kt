package com.awesomeapp.sessionuser

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.newsidentity.Api188_6


@Singleton
class Repository316_5 @Inject constructor(
    private val api0: Api152_6,
    private val api1: Api220_6,
    private val api2: Api208_6,
    private val api3: Api148_6,
    private val api4: Api188_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}