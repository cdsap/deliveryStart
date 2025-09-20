package com.awesomeapp.messagelogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.report.Api24_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.usercontact.Api56_6


@Singleton
class Repository116_5 @Inject constructor(
    private val api0: Api24_6,
    private val api1: Api108_6,
    private val api2: Api88_6,
    private val api3: Api80_6,
    private val api4: Api84_6,
    private val api5: Api48_6,
    private val api6: Api12_6,
    private val api7: Api36_6,
    private val api8: Api44_6,
    private val api9: Api56_6
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