package com.awesomeapp.filelocation

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
import com.awesomeapp.eventpost.Repository520_5
import com.awesomeapp.photosearch.Repository584_5
import com.awesomeapp.checkoutsearch.Repository544_5
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.gallerypost.Repository536_5
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.searchlocation.Repository600_5
import com.awesomeapp.filesearch.Repository572_5
import com.awesomeapp.mappost.Repository528_5
import com.awesomeapp.playlistsearch.Repository588_5
import com.awesomeapp.commentpost.Repository500_5


@HiltViewModel
class Viewmodel621_1 @Inject constructor(
    private val repository0: Repository520_5,
    private val repository1: Repository584_5,
    private val repository2: Repository544_5,
    private val repository3: Repository512_5,
    private val repository4: Repository536_5,
    private val repository5: Repository452_5,
    private val repository6: Repository600_5,
    private val repository7: Repository572_5,
    private val repository8: Repository528_5,
    private val repository9: Repository588_5,
    private val repository10: Repository500_5
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