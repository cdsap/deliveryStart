package com.awesomeapp.todofeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.metriccart.Api272_6


@Singleton
class Repository428_5 @Inject constructor(
    private val api0: Api168_6,
    private val api1: Api176_6,
    private val api2: Api300_6,
    private val api3: Api248_6,
    private val api4: Api272_6
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