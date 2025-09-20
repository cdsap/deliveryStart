package com.awesomeapp.mappost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.articleuser.Api336_6


@Singleton
class Repository528_5 @Inject constructor(
    private val api0: Api348_6,
    private val api1: Api368_6,
    private val api2: Api384_6,
    private val api3: Api412_6,
    private val api4: Api436_6,
    private val api5: Api420_6,
    private val api6: Api336_6
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