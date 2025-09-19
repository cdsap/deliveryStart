package com.awesomeapp.statuslogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.logincontact.Api52_6


@Singleton
class Repository124_5 @Inject constructor(
    private val api0: Api36_6,
    private val api1: Api48_6,
    private val api2: Api16_6,
    private val api3: Api4_6,
    private val api4: Api28_6,
    private val api5: Api52_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}