package com.awesomeapp.galleryfeed

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
import com.awesomeapp.logincart.Repository248_5
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.sharecheckout.Repository212_5
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.reportcheckout.Repository220_5
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.locationidentity.Repository160_5


@HiltViewModel
class Viewmodel438_1 @Inject constructor(
    private val repository0: Repository248_5,
    private val repository1: Repository240_5,
    private val repository2: Repository212_5,
    private val repository3: Repository228_5,
    private val repository4: Repository284_5,
    private val repository5: Repository288_5,
    private val repository6: Repository220_5,
    private val repository7: Repository300_5,
    private val repository8: Repository196_5,
    private val repository9: Repository180_5,
    private val repository10: Repository192_5,
    private val repository11: Repository160_5
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