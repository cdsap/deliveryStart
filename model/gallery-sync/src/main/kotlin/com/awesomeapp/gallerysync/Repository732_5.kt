package com.awesomeapp.gallerysync

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.documentpost.Api524_6
import com.awesomeapp.locationsearch.Api552_6
import com.awesomeapp.weathercomment.Api480_6
import com.awesomeapp.identitylocation.Api592_6
import com.awesomeapp.profilelocation.Api596_6


@Singleton
class Repository732_5 @Inject constructor(
    private val api0: Api524_6,
    private val api1: Api552_6,
    private val api2: Api480_6,
    private val api3: Api592_6,
    private val api4: Api596_6
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