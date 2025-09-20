package com.awesomeapp.sessionidentity

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
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.notificationcontact.Repository68_5
import com.awesomeapp.share.Repository16_5
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.commentlogin.Repository108_5


@HiltViewModel
class Viewmodel169_1 @Inject constructor(
    private val repository0: Repository140_5,
    private val repository1: Repository120_5,
    private val repository2: Repository144_5,
    private val repository3: Repository44_5,
    private val repository4: Repository72_5,
    private val repository5: Repository136_5,
    private val repository6: Repository68_5,
    private val repository7: Repository16_5,
    private val repository8: Repository128_5,
    private val repository9: Repository40_5,
    private val repository10: Repository88_5,
    private val repository11: Repository20_5,
    private val repository12: Repository112_5,
    private val repository13: Repository132_5,
    private val repository14: Repository80_5,
    private val repository15: Repository12_5,
    private val repository16: Repository56_5,
    private val repository17: Repository108_5
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