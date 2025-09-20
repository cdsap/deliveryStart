package com.awesomeapp.reportlocation

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.commentpost.Api500_6
import com.awesomeapp.mediacomment.Api488_6
import com.awesomeapp.analyticscomment.Api464_6
import com.awesomeapp.filesearch.Api572_6
import com.awesomeapp.logsearch.Api564_6
import com.awesomeapp.sessionpost.Api512_6
import com.awesomeapp.newssearch.Api580_6


@Singleton
class Repository612_5 @Inject constructor(
    private val api0: Api500_6,
    private val api1: Api488_6,
    private val api2: Api464_6,
    private val api3: Api572_6,
    private val api4: Api564_6,
    private val api5: Api512_6,
    private val api6: Api580_6
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