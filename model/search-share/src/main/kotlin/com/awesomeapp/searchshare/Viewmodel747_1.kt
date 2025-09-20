package com.awesomeapp.searchshare

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
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.documentpost.Repository524_5
import com.awesomeapp.feedsearch.Repository548_5
import com.awesomeapp.newssearch.Repository580_5
import com.awesomeapp.pushsearch.Repository540_5
import com.awesomeapp.networkpost.Repository504_5
import com.awesomeapp.identitylocation.Repository592_5
import com.awesomeapp.accountsearch.Repository560_5
import com.awesomeapp.logsearch.Repository564_5
import com.awesomeapp.contactpost.Repository492_5
import com.awesomeapp.eventpost.Repository520_5
import com.awesomeapp.statuspost.Repository516_5


@HiltViewModel
class Viewmodel747_1 @Inject constructor(
    private val repository0: Repository512_5,
    private val repository1: Repository524_5,
    private val repository2: Repository548_5,
    private val repository3: Repository580_5,
    private val repository4: Repository540_5,
    private val repository5: Repository504_5,
    private val repository6: Repository592_5,
    private val repository7: Repository560_5,
    private val repository8: Repository564_5,
    private val repository9: Repository492_5,
    private val repository10: Repository520_5,
    private val repository11: Repository516_5
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
                            { repository11.getData() }
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