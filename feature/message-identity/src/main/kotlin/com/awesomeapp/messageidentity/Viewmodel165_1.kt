package com.awesomeapp.messageidentity

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
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.podcastcontact.Repository92_5


@HiltViewModel
class Viewmodel165_1 @Inject constructor(
    private val repository0: Repository40_5,
    private val repository1: Repository44_5,
    private val repository2: Repository56_5,
    private val repository3: Repository108_5,
    private val repository4: Repository20_5,
    private val repository5: Repository80_5,
    private val repository6: Repository4_5,
    private val repository7: Repository92_5
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
                            { repository7.getData() }
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