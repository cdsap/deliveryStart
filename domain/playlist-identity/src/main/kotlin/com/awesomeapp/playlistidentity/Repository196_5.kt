package com.awesomeapp.playlistidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.podcastcontact.Api92_6


@Singleton
class Repository196_5 @Inject constructor(
    private val api0: Api140_6,
    private val api1: Api136_6,
    private val api2: Api84_6,
    private val api3: Api72_6,
    private val api4: Api96_6,
    private val api5: Api128_6,
    private val api6: Api92_6
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