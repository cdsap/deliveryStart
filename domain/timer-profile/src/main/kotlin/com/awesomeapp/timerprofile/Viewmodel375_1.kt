package com.awesomeapp.timerprofile

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
import com.awesomeapp.searchcheckout.Repository208_5
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.identitycheckout.Repository200_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.settingcheckout.Repository216_5
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.usercart.Repository252_5
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.contactuser.Repository296_5


@HiltViewModel
class Viewmodel375_1 @Inject constructor(
    private val repository0: Repository208_5,
    private val repository1: Repository256_5,
    private val repository2: Repository188_5,
    private val repository3: Repository236_5,
    private val repository4: Repository164_5,
    private val repository5: Repository228_5,
    private val repository6: Repository156_5,
    private val repository7: Repository200_5,
    private val repository8: Repository284_5,
    private val repository9: Repository192_5,
    private val repository10: Repository216_5,
    private val repository11: Repository300_5,
    private val repository12: Repository160_5,
    private val repository13: Repository176_5,
    private val repository14: Repository252_5,
    private val repository15: Repository180_5,
    private val repository16: Repository276_5,
    private val repository17: Repository152_5,
    private val repository18: Repository196_5,
    private val repository19: Repository296_5
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
                            { repository17.getData() },
                            { repository18.getData() },
                            { repository19.getData() }
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