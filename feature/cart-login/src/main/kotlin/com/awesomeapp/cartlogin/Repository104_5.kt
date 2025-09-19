package com.awesomeapp.cartlogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.task.Api28_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.notificationcontact.Api68_6


@Singleton
class Repository104_5 @Inject constructor(
    private val api0: Api28_6,
    private val api1: Api56_6,
    private val api2: Api60_6,
    private val api3: Api52_6,
    private val api4: Api44_6,
    private val api5: Api16_6,
    private val api6: Api68_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() },
                        { api6.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}