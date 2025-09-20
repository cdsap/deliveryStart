package com.awesomeapp.weathernetwork

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.newssearch.Api580_6
import com.awesomeapp.commentpost.Api500_6
import com.awesomeapp.notificationcomment.Api460_6


@Singleton
class Repository676_5 @Inject constructor(
    private val api0: Api580_6,
    private val api1: Api500_6,
    private val api2: Api460_6
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