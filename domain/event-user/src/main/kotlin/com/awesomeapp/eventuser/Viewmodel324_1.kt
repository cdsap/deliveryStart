package com.awesomeapp.eventuser

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
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.logincart.Repository248_5
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.postcart.Repository256_5


@HiltViewModel
class Viewmodel324_1 @Inject constructor(
    private val repository0: Repository156_5,
    private val repository1: Repository272_5,
    private val repository2: Repository164_5,
    private val repository3: Repository280_5,
    private val repository4: Repository248_5,
    private val repository5: Repository276_5,
    private val repository6: Repository244_5,
    private val repository7: Repository152_5,
    private val repository8: Repository256_5
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