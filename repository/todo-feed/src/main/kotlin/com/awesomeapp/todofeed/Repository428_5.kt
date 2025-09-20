package com.awesomeapp.todofeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.alarmcart.Api276_6


@Singleton
class Repository428_5 @Inject constructor(
    private val api0: Api320_6,
    private val api1: Api308_6,
    private val api2: Api288_6,
    private val api3: Api276_6
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