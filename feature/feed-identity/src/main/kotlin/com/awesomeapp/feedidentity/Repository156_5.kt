package com.awesomeapp.feedidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.synccontact.Api64_6


@Singleton
class Repository156_5 @Inject constructor(
    private val api0: Api88_6,
    private val api1: Api100_6,
    private val api2: Api140_6,
    private val api3: Api124_6,
    private val api4: Api12_6,
    private val api5: Api20_6,
    private val api6: Api92_6,
    private val api7: Api68_6,
    private val api8: Api64_6
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
                        { api6.fetchData() },
                        { api7.fetchData() },
                        { api8.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}