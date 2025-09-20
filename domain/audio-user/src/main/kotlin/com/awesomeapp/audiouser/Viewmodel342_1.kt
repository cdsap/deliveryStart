package com.awesomeapp.audiouser

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
import com.awesomeapp.taskcheckout.Repository224_5
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.listidentity.Repository184_5
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.profilecheckout.Repository204_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.identitycheckout.Repository200_5
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.usercart.Repository252_5
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.searchcheckout.Repository208_5


@HiltViewModel
class Viewmodel342_1 @Inject constructor(
    private val repository0: Repository224_5,
    private val repository1: Repository244_5,
    private val repository2: Repository184_5,
    private val repository3: Repository160_5,
    private val repository4: Repository280_5,
    private val repository5: Repository232_5,
    private val repository6: Repository292_5,
    private val repository7: Repository204_5,
    private val repository8: Repository284_5,
    private val repository9: Repository172_5,
    private val repository10: Repository268_5,
    private val repository11: Repository200_5,
    private val repository12: Repository188_5,
    private val repository13: Repository176_5,
    private val repository14: Repository164_5,
    private val repository15: Repository252_5,
    private val repository16: Repository256_5,
    private val repository17: Repository208_5
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