package com.awesomeapp.statuslocation

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
import com.awesomeapp.newssearch.Repository580_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.filesearch.Repository572_5
import com.awesomeapp.articlepost.Repository532_5
import com.awesomeapp.mappost.Repository528_5
import com.awesomeapp.messagepost.Repository508_5
import com.awesomeapp.eventpost.Repository520_5
import com.awesomeapp.pushsearch.Repository540_5
import com.awesomeapp.weathercomment.Repository480_5
import com.awesomeapp.notificationcomment.Repository460_5
import com.awesomeapp.groupsearch.Repository556_5
import com.awesomeapp.statuspost.Repository516_5
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.gallerypost.Repository536_5
import com.awesomeapp.synccomment.Repository456_5
import com.awesomeapp.alarmcomment.Repository472_5


@HiltViewModel
class Viewmodel614_1 @Inject constructor(
    private val repository0: Repository580_5,
    private val repository1: Repository552_5,
    private val repository2: Repository572_5,
    private val repository3: Repository532_5,
    private val repository4: Repository528_5,
    private val repository5: Repository508_5,
    private val repository6: Repository520_5,
    private val repository7: Repository540_5,
    private val repository8: Repository480_5,
    private val repository9: Repository460_5,
    private val repository10: Repository556_5,
    private val repository11: Repository516_5,
    private val repository12: Repository512_5,
    private val repository13: Repository536_5,
    private val repository14: Repository456_5,
    private val repository15: Repository472_5
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
                            { repository15.getData() }
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