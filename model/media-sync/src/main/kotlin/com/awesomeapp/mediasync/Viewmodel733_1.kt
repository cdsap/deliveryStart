package com.awesomeapp.mediasync

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
import com.awesomeapp.accountsearch.Repository560_5
import com.awesomeapp.logsearch.Repository564_5
import com.awesomeapp.alarmcomment.Repository472_5
import com.awesomeapp.gallerypost.Repository536_5
import com.awesomeapp.pushsearch.Repository540_5
import com.awesomeapp.profilelocation.Repository596_5
import com.awesomeapp.synccomment.Repository456_5
import com.awesomeapp.mediacomment.Repository488_5
import com.awesomeapp.podcastcomment.Repository484_5
import com.awesomeapp.statuspost.Repository516_5
import com.awesomeapp.identitylocation.Repository592_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.playlistsearch.Repository588_5
import com.awesomeapp.metriccomment.Repository468_5


@HiltViewModel
class Viewmodel733_1 @Inject constructor(
    private val repository0: Repository560_5,
    private val repository1: Repository564_5,
    private val repository2: Repository472_5,
    private val repository3: Repository536_5,
    private val repository4: Repository540_5,
    private val repository5: Repository596_5,
    private val repository6: Repository456_5,
    private val repository7: Repository488_5,
    private val repository8: Repository484_5,
    private val repository9: Repository516_5,
    private val repository10: Repository592_5,
    private val repository11: Repository552_5,
    private val repository12: Repository588_5,
    private val repository13: Repository468_5
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
                            { repository13.getData() }
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