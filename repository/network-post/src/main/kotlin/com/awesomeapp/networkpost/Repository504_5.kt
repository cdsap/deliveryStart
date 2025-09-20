package com.awesomeapp.networkpost

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.logincomment.Api444_6
import com.awesomeapp.fileprofile.Api376_6


@Singleton
class Repository504_5 @Inject constructor(
    private val api0: Api420_6,
    private val api1: Api340_6,
    private val api2: Api380_6,
    private val api3: Api408_6,
    private val api4: Api312_6,
    private val api5: Api308_6,
    private val api6: Api356_6,
    private val api7: Api436_6,
    private val api8: Api444_6,
    private val api9: Api376_6
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
                        { api8.fetchData() },
                        { api9.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}