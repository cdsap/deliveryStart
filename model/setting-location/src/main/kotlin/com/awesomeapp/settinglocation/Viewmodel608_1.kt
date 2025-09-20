package com.awesomeapp.settinglocation

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
import com.awesomeapp.checkoutsearch.Repository544_5
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.newssearch.Repository580_5
import com.awesomeapp.messagepost.Repository508_5
import com.awesomeapp.logsearch.Repository564_5
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.profilelocation.Repository596_5
import com.awesomeapp.statuspost.Repository516_5
import com.awesomeapp.mediacomment.Repository488_5
import com.awesomeapp.mappost.Repository528_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.groupsearch.Repository556_5
import com.awesomeapp.eventpost.Repository520_5


@HiltViewModel
class Viewmodel608_1 @Inject constructor(
    private val repository0: Repository544_5,
    private val repository1: Repository512_5,
    private val repository2: Repository580_5,
    private val repository3: Repository508_5,
    private val repository4: Repository564_5,
    private val repository5: Repository452_5,
    private val repository6: Repository596_5,
    private val repository7: Repository516_5,
    private val repository8: Repository488_5,
    private val repository9: Repository528_5,
    private val repository10: Repository552_5,
    private val repository11: Repository556_5,
    private val repository12: Repository520_5
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
                            { repository12.getData() }
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