package com.awesomeapp.postidentity

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
import com.awesomeapp.report.Repository24_5
import com.awesomeapp.timer.Repository32_5
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.share.Repository16_5
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.mediacontact.Repository96_5


@HiltViewModel
class Viewmodel158_1 @Inject constructor(
    private val repository0: Repository24_5,
    private val repository1: Repository32_5,
    private val repository2: Repository20_5,
    private val repository3: Repository76_5,
    private val repository4: Repository44_5,
    private val repository5: Repository88_5,
    private val repository6: Repository16_5,
    private val repository7: Repository64_5,
    private val repository8: Repository52_5,
    private val repository9: Repository28_5,
    private val repository10: Repository96_5
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
                            { repository10.getData() }
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