package com.awesomeapp.articlepost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.timerfeed.Api424_6


@Singleton
class Repository532_5 @Inject constructor(
    private val api0: Api352_6,
    private val api1: Api436_6,
    private val api2: Api408_6,
    private val api3: Api372_6,
    private val api4: Api360_6,
    private val api5: Api304_6,
    private val api6: Api424_6
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