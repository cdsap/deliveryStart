package com.awesomeapp.commentnetwork

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
import com.awesomeapp.articlepost.Repository532_5
import com.awesomeapp.cartpost.Repository496_5
import com.awesomeapp.weathercomment.Repository480_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.identitylocation.Repository592_5
import com.awesomeapp.messagepost.Repository508_5
import com.awesomeapp.podcastcomment.Repository484_5
import com.awesomeapp.listsearch.Repository576_5
import com.awesomeapp.searchlocation.Repository600_5


@HiltViewModel
class Viewmodel647_1 @Inject constructor(
    private val repository0: Repository532_5,
    private val repository1: Repository496_5,
    private val repository2: Repository480_5,
    private val repository3: Repository552_5,
    private val repository4: Repository592_5,
    private val repository5: Repository508_5,
    private val repository6: Repository484_5,
    private val repository7: Repository576_5,
    private val repository8: Repository600_5
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