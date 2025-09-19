package com.awesomeapp.newsidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.sessionlogin.Api120_6


@Singleton
class Repository188_5 @Inject constructor(
    private val api0: Api132_6,
    private val api1: Api72_6,
    private val api2: Api96_6,
    private val api3: Api136_6,
    private val api4: Api92_6,
    private val api5: Api112_6,
    private val api6: Api120_6
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