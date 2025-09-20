package com.awesomeapp.mediacart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.search.Api12_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.notecontact.Api84_6


@Singleton
class Repository292_5 @Inject constructor(
    private val api0: Api12_6,
    private val api1: Api32_6,
    private val api2: Api36_6,
    private val api3: Api84_6
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