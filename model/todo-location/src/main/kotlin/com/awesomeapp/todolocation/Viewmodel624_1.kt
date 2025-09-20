package com.awesomeapp.todolocation

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
import com.awesomeapp.documentpost.Repository524_5
import com.awesomeapp.newssearch.Repository580_5
import com.awesomeapp.mediacomment.Repository488_5
import com.awesomeapp.feedsearch.Repository548_5
import com.awesomeapp.listsearch.Repository576_5
import com.awesomeapp.synccomment.Repository456_5


@HiltViewModel
class Viewmodel624_1 @Inject constructor(
    private val repository0: Repository524_5,
    private val repository1: Repository580_5,
    private val repository2: Repository488_5,
    private val repository3: Repository548_5,
    private val repository4: Repository576_5,
    private val repository5: Repository456_5
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