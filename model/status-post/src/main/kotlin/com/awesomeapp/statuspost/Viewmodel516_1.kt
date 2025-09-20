package com.awesomeapp.statuspost

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
import com.awesomeapp.profilefeed.Repository400_5
import com.awesomeapp.newsprofile.Repository384_5
import com.awesomeapp.playlistprofile.Repository392_5
import com.awesomeapp.articleuser.Repository336_5
import com.awesomeapp.forecastfeed.Repository432_5
import com.awesomeapp.searchfeed.Repository404_5
import com.awesomeapp.sharefeed.Repository408_5
import com.awesomeapp.videofeed.Repository436_5


@HiltViewModel
class Viewmodel516_1 @Inject constructor(
    private val repository0: Repository400_5,
    private val repository1: Repository384_5,
    private val repository2: Repository392_5,
    private val repository3: Repository336_5,
    private val repository4: Repository432_5,
    private val repository5: Repository404_5,
    private val repository6: Repository408_5,
    private val repository7: Repository436_5
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
                            { repository7.getData() }
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