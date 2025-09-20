package com.awesomeapp.checkoutprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.weathercart.Api284_6


@Singleton
class Repository348_5 @Inject constructor(
    private val api0: Api288_6,
    private val api1: Api296_6,
    private val api2: Api284_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}