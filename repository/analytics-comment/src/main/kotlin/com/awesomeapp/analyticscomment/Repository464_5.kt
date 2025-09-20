package com.awesomeapp.analyticscomment

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.logincomment.Api444_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.timerfeed.Api424_6


@Singleton
class Repository464_5 @Inject constructor(
    private val api0: Api360_6,
    private val api1: Api332_6,
    private val api2: Api396_6,
    private val api3: Api384_6,
    private val api4: Api428_6,
    private val api5: Api444_6,
    private val api6: Api408_6,
    private val api7: Api424_6
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
                        { api7.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}