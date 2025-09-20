package com.awesomeapp.playlistidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.commentlogin.Api108_6


@Singleton
class Repository196_5 @Inject constructor(
    private val api0: Api52_6,
    private val api1: Api120_6,
    private val api2: Api32_6,
    private val api3: Api64_6,
    private val api4: Api144_6,
    private val api5: Api108_6
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