package com.awesomeapp.logfeed

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
import com.awesomeapp.sessionuser.Repository316_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.taskcheckout.Repository224_5
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.messageuser.Repository312_5


@HiltViewModel
class Viewmodel417_1 @Inject constructor(
    private val repository0: Repository316_5,
    private val repository1: Repository304_5,
    private val repository2: Repository276_5,
    private val repository3: Repository244_5,
    private val repository4: Repository224_5,
    private val repository5: Repository260_5,
    private val repository6: Repository256_5,
    private val repository7: Repository284_5,
    private val repository8: Repository328_5,
    private val repository9: Repository272_5,
    private val repository10: Repository312_5
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