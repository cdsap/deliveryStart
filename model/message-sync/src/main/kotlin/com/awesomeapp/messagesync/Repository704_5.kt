package com.awesomeapp.messagesync

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.synccomment.Api456_6
import com.awesomeapp.notificationcomment.Api460_6
import com.awesomeapp.calendarsearch.Api568_6
import com.awesomeapp.listsearch.Api576_6
import com.awesomeapp.playlistsearch.Api588_6
import com.awesomeapp.eventpost.Api520_6
import com.awesomeapp.groupsearch.Api556_6
import com.awesomeapp.mediacomment.Api488_6
import com.awesomeapp.podcastcomment.Api484_6


@Singleton
class Repository704_5 @Inject constructor(
    private val api0: Api456_6,
    private val api1: Api460_6,
    private val api2: Api568_6,
    private val api3: Api576_6,
    private val api4: Api588_6,
    private val api5: Api520_6,
    private val api6: Api556_6,
    private val api7: Api488_6,
    private val api8: Api484_6
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