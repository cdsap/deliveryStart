package com.awesomeapp.feedpost

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
import com.awesomeapp.identityfeed.Repository396_5
import com.awesomeapp.settingfeed.Repository412_5
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.photoprofile.Repository388_5
import com.awesomeapp.accountprofile.Repository364_5
import com.awesomeapp.reportfeed.Repository416_5
import com.awesomeapp.timerfeed.Repository424_5


@HiltViewModel
class Viewmodel499_1 @Inject constructor(
    private val repository0: Repository396_5,
    private val repository1: Repository412_5,
    private val repository2: Repository352_5,
    private val repository3: Repository388_5,
    private val repository4: Repository364_5,
    private val repository5: Repository416_5,
    private val repository6: Repository424_5
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