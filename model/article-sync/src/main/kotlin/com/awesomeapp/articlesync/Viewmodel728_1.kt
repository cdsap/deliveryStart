package com.awesomeapp.articlesync

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
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.calendarsearch.Repository568_5
import com.awesomeapp.gallerypost.Repository536_5
import com.awesomeapp.photosearch.Repository584_5
import com.awesomeapp.podcastcomment.Repository484_5
import com.awesomeapp.searchlocation.Repository600_5
import com.awesomeapp.mediacomment.Repository488_5
import com.awesomeapp.synccomment.Repository456_5
import com.awesomeapp.metriccomment.Repository468_5
import com.awesomeapp.analyticscomment.Repository464_5


@HiltViewModel
class Viewmodel728_1 @Inject constructor(
    private val repository0: Repository452_5,
    private val repository1: Repository568_5,
    private val repository2: Repository536_5,
    private val repository3: Repository584_5,
    private val repository4: Repository484_5,
    private val repository5: Repository600_5,
    private val repository6: Repository488_5,
    private val repository7: Repository456_5,
    private val repository8: Repository468_5,
    private val repository9: Repository464_5
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
                            { repository9.getData() }
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