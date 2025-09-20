package com.awesomeapp.reportcomment

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
import com.awesomeapp.profilefeed.Repository400_5
import com.awesomeapp.timerfeed.Repository424_5
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.pushprofile.Repository344_5
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.logprofile.Repository368_5
import com.awesomeapp.todofeed.Repository428_5
import com.awesomeapp.groupprofile.Repository360_5
import com.awesomeapp.identityfeed.Repository396_5
import com.awesomeapp.taskfeed.Repository420_5


@HiltViewModel
class Viewmodel465_1 @Inject constructor(
    private val repository0: Repository400_5,
    private val repository1: Repository424_5,
    private val repository2: Repository352_5,
    private val repository3: Repository344_5,
    private val repository4: Repository372_5,
    private val repository5: Repository368_5,
    private val repository6: Repository428_5,
    private val repository7: Repository360_5,
    private val repository8: Repository396_5,
    private val repository9: Repository420_5
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
                            { repository9.getData() }
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