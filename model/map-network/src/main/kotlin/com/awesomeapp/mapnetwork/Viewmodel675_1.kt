package com.awesomeapp.mapnetwork

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
import com.awesomeapp.playlistsearch.Repository588_5
import com.awesomeapp.filesearch.Repository572_5
import com.awesomeapp.calendarsearch.Repository568_5
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.profilelocation.Repository596_5
import com.awesomeapp.articlepost.Repository532_5
import com.awesomeapp.identitylocation.Repository592_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.podcastcomment.Repository484_5
import com.awesomeapp.commentpost.Repository500_5
import com.awesomeapp.groupsearch.Repository556_5
import com.awesomeapp.photosearch.Repository584_5
import com.awesomeapp.weathercomment.Repository480_5
import com.awesomeapp.synccomment.Repository456_5


@HiltViewModel
class Viewmodel675_1 @Inject constructor(
    private val repository0: Repository588_5,
    private val repository1: Repository572_5,
    private val repository2: Repository568_5,
    private val repository3: Repository452_5,
    private val repository4: Repository596_5,
    private val repository5: Repository532_5,
    private val repository6: Repository592_5,
    private val repository7: Repository552_5,
    private val repository8: Repository484_5,
    private val repository9: Repository500_5,
    private val repository10: Repository556_5,
    private val repository11: Repository584_5,
    private val repository12: Repository480_5,
    private val repository13: Repository456_5
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