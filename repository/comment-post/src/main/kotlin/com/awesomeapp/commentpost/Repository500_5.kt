package com.awesomeapp.commentpost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.photoprofile.Api388_6


@Singleton
class Repository500_5 @Inject constructor(
    private val api0: Api404_6,
    private val api1: Api384_6,
    private val api2: Api428_6,
    private val api3: Api388_6
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