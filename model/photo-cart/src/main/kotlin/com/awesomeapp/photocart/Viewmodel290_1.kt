package com.awesomeapp.photocart

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
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.sharecheckout.Repository212_5
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.settingcheckout.Repository216_5
import com.awesomeapp.synccart.Repository260_5


@HiltViewModel
class Viewmodel290_1 @Inject constructor(
    private val repository0: Repository228_5,
    private val repository1: Repository232_5,
    private val repository2: Repository272_5,
    private val repository3: Repository212_5,
    private val repository4: Repository236_5,
    private val repository5: Repository216_5,
    private val repository6: Repository260_5
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