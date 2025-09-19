package com.awesomeapp.videocheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.calendaridentity.Api176_6


@Singleton
class Repository240_5 @Inject constructor(
    private val api0: Api184_6,
    private val api1: Api180_6,
    private val api2: Api148_6,
    private val api3: Api176_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}