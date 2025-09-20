package com.awesomeapp.cartnetwork

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
import com.awesomeapp.cartpost.Repository496_5
import com.awesomeapp.playlistsearch.Repository588_5
import com.awesomeapp.contactpost.Repository492_5
import com.awesomeapp.eventpost.Repository520_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.synccomment.Repository456_5
import com.awesomeapp.photosearch.Repository584_5
import com.awesomeapp.filesearch.Repository572_5
import com.awesomeapp.mediacomment.Repository488_5
import com.awesomeapp.analyticscomment.Repository464_5
import com.awesomeapp.mappost.Repository528_5
import com.awesomeapp.commentpost.Repository500_5
import com.awesomeapp.listsearch.Repository576_5
import com.awesomeapp.groupsearch.Repository556_5
import com.awesomeapp.gallerypost.Repository536_5


@HiltViewModel
class Viewmodel643_1 @Inject constructor(
    private val repository0: Repository496_5,
    private val repository1: Repository588_5,
    private val repository2: Repository492_5,
    private val repository3: Repository520_5,
    private val repository4: Repository552_5,
    private val repository5: Repository456_5,
    private val repository6: Repository584_5,
    private val repository7: Repository572_5,
    private val repository8: Repository488_5,
    private val repository9: Repository464_5,
    private val repository10: Repository528_5,
    private val repository11: Repository500_5,
    private val repository12: Repository576_5,
    private val repository13: Repository556_5,
    private val repository14: Repository536_5
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
                            { repository14.getData() }
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