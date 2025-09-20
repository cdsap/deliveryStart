package com.awesomeapp.todonetwork

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
import com.awesomeapp.networkpost.Repository504_5
import com.awesomeapp.groupsearch.Repository556_5
import com.awesomeapp.listsearch.Repository576_5
import com.awesomeapp.feedsearch.Repository548_5
import com.awesomeapp.alarmcomment.Repository472_5
import com.awesomeapp.calendarsearch.Repository568_5
import com.awesomeapp.profilelocation.Repository596_5
import com.awesomeapp.articlepost.Repository532_5
import com.awesomeapp.logsearch.Repository564_5


@HiltViewModel
class Viewmodel673_1 @Inject constructor(
    private val repository0: Repository504_5,
    private val repository1: Repository556_5,
    private val repository2: Repository576_5,
    private val repository3: Repository548_5,
    private val repository4: Repository472_5,
    private val repository5: Repository568_5,
    private val repository6: Repository596_5,
    private val repository7: Repository532_5,
    private val repository8: Repository564_5
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
                            { repository8.getData() }
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