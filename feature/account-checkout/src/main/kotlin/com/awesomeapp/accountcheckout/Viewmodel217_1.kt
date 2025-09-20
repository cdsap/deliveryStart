package com.awesomeapp.accountcheckout

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
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.report.Repository24_5
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.documentlogin.Repository132_5


@HiltViewModel
class Viewmodel217_1 @Inject constructor(
    private val repository0: Repository124_5,
    private val repository1: Repository88_5,
    private val repository2: Repository28_5,
    private val repository3: Repository76_5,
    private val repository4: Repository140_5,
    private val repository5: Repository24_5,
    private val repository6: Repository52_5,
    private val repository7: Repository128_5,
    private val repository8: Repository96_5,
    private val repository9: Repository4_5,
    private val repository10: Repository40_5,
    private val repository11: Repository12_5,
    private val repository12: Repository108_5,
    private val repository13: Repository148_5,
    private val repository14: Repository44_5,
    private val repository15: Repository8_5,
    private val repository16: Repository56_5,
    private val repository17: Repository132_5
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
                            { repository11.getData() },
                            { repository12.getData() },
                            { repository13.getData() },
                            { repository14.getData() },
                            { repository15.getData() },
                            { repository16.getData() },
                            { repository17.getData() }
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