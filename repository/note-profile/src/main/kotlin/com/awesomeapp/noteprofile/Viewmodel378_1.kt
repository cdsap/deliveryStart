package com.awesomeapp.noteprofile

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
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.statususer.Repository320_5
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.networkuser.Repository308_5


@HiltViewModel
class Viewmodel378_1 @Inject constructor(
    private val repository0: Repository240_5,
    private val repository1: Repository284_5,
    private val repository2: Repository228_5,
    private val repository3: Repository304_5,
    private val repository4: Repository296_5,
    private val repository5: Repository272_5,
    private val repository6: Repository320_5,
    private val repository7: Repository288_5,
    private val repository8: Repository308_5
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
                            { repository8.getData() }
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