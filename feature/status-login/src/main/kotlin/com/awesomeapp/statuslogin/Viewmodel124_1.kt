package com.awesomeapp.statuslogin

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
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.share.Repository16_5
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.logincontact.Repository52_5


@HiltViewModel
class Viewmodel124_1 @Inject constructor(
    private val repository0: Repository36_5,
    private val repository1: Repository48_5,
    private val repository2: Repository16_5,
    private val repository3: Repository4_5,
    private val repository4: Repository28_5,
    private val repository5: Repository52_5
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