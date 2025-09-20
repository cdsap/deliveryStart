package com.awesomeapp.pushcart

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
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.podcastcontact.Repository92_5
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.timer.Repository32_5
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.eventlogin.Repository128_5


@HiltViewModel
class Viewmodel246_1 @Inject constructor(
    private val repository0: Repository4_5,
    private val repository1: Repository36_5,
    private val repository2: Repository96_5,
    private val repository3: Repository44_5,
    private val repository4: Repository92_5,
    private val repository5: Repository20_5,
    private val repository6: Repository52_5,
    private val repository7: Repository32_5,
    private val repository8: Repository112_5,
    private val repository9: Repository144_5,
    private val repository10: Repository116_5,
    private val repository11: Repository148_5,
    private val repository12: Repository28_5,
    private val repository13: Repository128_5
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