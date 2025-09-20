package com.awesomeapp.mapsync

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
import com.awesomeapp.listsearch.Repository576_5
import com.awesomeapp.alarmcomment.Repository472_5
import com.awesomeapp.checkoutsearch.Repository544_5
import com.awesomeapp.searchlocation.Repository600_5
import com.awesomeapp.commentpost.Repository500_5


@HiltViewModel
class Viewmodel724_1 @Inject constructor(
    private val repository0: Repository504_5,
    private val repository1: Repository576_5,
    private val repository2: Repository472_5,
    private val repository3: Repository544_5,
    private val repository4: Repository600_5,
    private val repository5: Repository500_5
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
                            { repository5.getData() }
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