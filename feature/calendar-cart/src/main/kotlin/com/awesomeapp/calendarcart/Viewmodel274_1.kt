package com.awesomeapp.calendarcart

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
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.notificationcontact.Repository68_5
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.contactlogin.Repository100_5
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.gallerylogin.Repository144_5


@HiltViewModel
class Viewmodel274_1 @Inject constructor(
    private val repository0: Repository40_5,
    private val repository1: Repository68_5,
    private val repository2: Repository28_5,
    private val repository3: Repository100_5,
    private val repository4: Repository76_5,
    private val repository5: Repository80_5,
    private val repository6: Repository36_5,
    private val repository7: Repository112_5,
    private val repository8: Repository116_5,
    private val repository9: Repository4_5,
    private val repository10: Repository144_5
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