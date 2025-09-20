package com.awesomeapp.audionetwork

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
import com.awesomeapp.profilelocation.Repository596_5
import com.awesomeapp.eventpost.Repository520_5
import com.awesomeapp.messagepost.Repository508_5
import com.awesomeapp.checkoutsearch.Repository544_5
import com.awesomeapp.notecomment.Repository476_5
import com.awesomeapp.networkpost.Repository504_5
import com.awesomeapp.locationsearch.Repository552_5


@HiltViewModel
class Viewmodel685_1 @Inject constructor(
    private val repository0: Repository596_5,
    private val repository1: Repository520_5,
    private val repository2: Repository508_5,
    private val repository3: Repository544_5,
    private val repository4: Repository476_5,
    private val repository5: Repository504_5,
    private val repository6: Repository552_5
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
                            { repository6.getData() }
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