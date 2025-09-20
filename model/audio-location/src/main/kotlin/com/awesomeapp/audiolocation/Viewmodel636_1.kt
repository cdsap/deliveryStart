package com.awesomeapp.audiolocation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.notecomment.Repository476_5
import com.awesomeapp.analyticscomment.Repository464_5
import com.awesomeapp.notificationcomment.Repository460_5
import com.awesomeapp.profilelocation.Repository596_5
import com.awesomeapp.playlistsearch.Repository588_5
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.accountsearch.Repository560_5
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.networkpost.Repository504_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.logsearch.Repository564_5
import com.awesomeapp.weathercomment.Repository480_5
import com.awesomeapp.calendarsearch.Repository568_5
import com.awesomeapp.metriccomment.Repository468_5
import com.awesomeapp.mappost.Repository528_5
import com.awesomeapp.newssearch.Repository580_5


@HiltViewModel
class Viewmodel636_1 @Inject constructor(
    private val repository0: Repository476_5,
    private val repository1: Repository464_5,
    private val repository2: Repository460_5,
    private val repository3: Repository596_5,
    private val repository4: Repository588_5,
    private val repository5: Repository452_5,
    private val repository6: Repository560_5,
    private val repository7: Repository512_5,
    private val repository8: Repository504_5,
    private val repository9: Repository552_5,
    private val repository10: Repository564_5,
    private val repository11: Repository480_5,
    private val repository12: Repository568_5,
    private val repository13: Repository468_5,
    private val repository14: Repository528_5,
    private val repository15: Repository580_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = coroutineScope {
                    val fetchers = listOf<suspend () -> String>(
                        { repository0.getData() },
                            { repository1.getData() },
                            { repository2.getData() },
                            { repository3.getData() },
                            { repository4.getData() },
                            { repository5.getData() },
                            { repository6.getData() },
                            { repository7.getData() },
                            { repository8.getData() },
                            { repository9.getData() },
                            { repository10.getData() },
                            { repository11.getData() },
                            { repository12.getData() },
                            { repository13.getData() },
                            { repository14.getData() },
                            { repository15.getData() }
                    )
                    val results = fetchers.map { fetcher ->
                        async { fetcher() }
                    }.awaitAll()
                    results.joinToString("")
                }
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: ${e.message}")
            }
        }
    }
}