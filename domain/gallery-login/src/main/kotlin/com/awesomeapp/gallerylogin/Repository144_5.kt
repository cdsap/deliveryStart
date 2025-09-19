package com.awesomeapp.gallerylogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.maplogin.Api136_6


@Singleton
class Repository144_5 @Inject constructor(
    private val api0: Api76_6,
    private val api1: Api108_6,
    private val api2: Api136_6
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