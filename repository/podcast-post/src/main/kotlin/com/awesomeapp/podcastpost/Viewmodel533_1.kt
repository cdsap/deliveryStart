package com.awesomeapp.podcastpost

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
import com.awesomeapp.sharefeed.Repository408_5
import com.awesomeapp.profilefeed.Repository400_5
import com.awesomeapp.usercomment.Repository448_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.identityfeed.Repository396_5
import com.awesomeapp.logincomment.Repository444_5
import com.awesomeapp.forecastfeed.Repository432_5
import com.awesomeapp.eventuser.Repository324_5


@HiltViewModel
class Viewmodel533_1 @Inject constructor(
    private val repository0: Repository408_5,
    private val repository1: Repository400_5,
    private val repository2: Repository448_5,
    private val repository3: Repository304_5,
    private val repository4: Repository308_5,
    private val repository5: Repository396_5,
    private val repository6: Repository444_5,
    private val repository7: Repository432_5,
    private val repository8: Repository324_5
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