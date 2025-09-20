package com.awesomeapp.calendarfeed

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
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.usercart.Repository252_5
import com.awesomeapp.messageuser.Repository312_5
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.logincart.Repository248_5


@HiltViewModel
class Viewmodel421_1 @Inject constructor(
    private val repository0: Repository260_5,
    private val repository1: Repository296_5,
    private val repository2: Repository304_5,
    private val repository3: Repository276_5,
    private val repository4: Repository240_5,
    private val repository5: Repository252_5,
    private val repository6: Repository312_5,
    private val repository7: Repository268_5,
    private val repository8: Repository300_5,
    private val repository9: Repository280_5,
    private val repository10: Repository228_5,
    private val repository11: Repository244_5,
    private val repository12: Repository232_5,
    private val repository13: Repository292_5,
    private val repository14: Repository256_5,
    private val repository15: Repository284_5,
    private val repository16: Repository236_5,
    private val repository17: Repository248_5
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