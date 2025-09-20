package com.awesomeapp.profilelocation

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.settingfeed.Api412_6


@Singleton
class Repository596_5 @Inject constructor(
    private val api0: Api356_6,
    private val api1: Api304_6,
    private val api2: Api340_6,
    private val api3: Api436_6,
    private val api4: Api324_6,
    private val api5: Api344_6,
    private val api6: Api412_6
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