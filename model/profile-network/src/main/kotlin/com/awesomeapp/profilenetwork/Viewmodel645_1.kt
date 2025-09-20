package com.awesomeapp.profilenetwork

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
import com.awesomeapp.notificationcomment.Repository460_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.photosearch.Repository584_5
import com.awesomeapp.synccomment.Repository456_5
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.gallerypost.Repository536_5
import com.awesomeapp.groupsearch.Repository556_5
import com.awesomeapp.filesearch.Repository572_5


@HiltViewModel
class Viewmodel645_1 @Inject constructor(
    private val repository0: Repository460_5,
    private val repository1: Repository552_5,
    private val repository2: Repository584_5,
    private val repository3: Repository456_5,
    private val repository4: Repository512_5,
    private val repository5: Repository536_5,
    private val repository6: Repository556_5,
    private val repository7: Repository572_5
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