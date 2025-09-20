package com.awesomeapp.eventpost

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
import com.awesomeapp.videofeed.Repository436_5
import com.awesomeapp.todofeed.Repository428_5
import com.awesomeapp.playlistprofile.Repository392_5
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.fileprofile.Repository376_5
import com.awesomeapp.timerfeed.Repository424_5
import com.awesomeapp.audiofeed.Repository440_5
import com.awesomeapp.articleuser.Repository336_5
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.reportfeed.Repository416_5
import com.awesomeapp.networkuser.Repository308_5


@HiltViewModel
class Viewmodel520_1 @Inject constructor(
    private val repository0: Repository316_5,
    private val repository1: Repository436_5,
    private val repository2: Repository428_5,
    private val repository3: Repository392_5,
    private val repository4: Repository348_5,
    private val repository5: Repository376_5,
    private val repository6: Repository424_5,
    private val repository7: Repository440_5,
    private val repository8: Repository336_5,
    private val repository9: Repository352_5,
    private val repository10: Repository416_5,
    private val repository11: Repository308_5
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