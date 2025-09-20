package com.awesomeapp.newssync

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
import com.awesomeapp.mappost.Repository528_5
import com.awesomeapp.feedsearch.Repository548_5
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.accountsearch.Repository560_5
import com.awesomeapp.checkoutsearch.Repository544_5
import com.awesomeapp.documentpost.Repository524_5
import com.awesomeapp.notificationcomment.Repository460_5
import com.awesomeapp.profilelocation.Repository596_5
import com.awesomeapp.synccomment.Repository456_5
import com.awesomeapp.filesearch.Repository572_5
import com.awesomeapp.locationsearch.Repository552_5
import com.awesomeapp.articlepost.Repository532_5
import com.awesomeapp.photosearch.Repository584_5
import com.awesomeapp.alarmcomment.Repository472_5
import com.awesomeapp.contactpost.Repository492_5
import com.awesomeapp.groupsearch.Repository556_5
import com.awesomeapp.gallerypost.Repository536_5
import com.awesomeapp.podcastcomment.Repository484_5
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.calendarsearch.Repository568_5
import com.awesomeapp.newssearch.Repository580_5
import com.awesomeapp.commentpost.Repository500_5
import com.awesomeapp.cartpost.Repository496_5
import com.awesomeapp.networkpost.Repository504_5
import com.awesomeapp.identitylocation.Repository592_5
import com.awesomeapp.metriccomment.Repository468_5
import com.awesomeapp.weathercomment.Repository480_5


@HiltViewModel
class Viewmodel727_1 @Inject constructor(
    private val repository0: Repository588_5,
    private val repository1: Repository528_5,
    private val repository2: Repository548_5,
    private val repository3: Repository512_5,
    private val repository4: Repository560_5,
    private val repository5: Repository544_5,
    private val repository6: Repository524_5,
    private val repository7: Repository460_5,
    private val repository8: Repository596_5,
    private val repository9: Repository456_5,
    private val repository10: Repository572_5,
    private val repository11: Repository552_5,
    private val repository12: Repository532_5,
    private val repository13: Repository584_5,
    private val repository14: Repository472_5,
    private val repository15: Repository492_5,
    private val repository16: Repository556_5,
    private val repository17: Repository536_5,
    private val repository18: Repository484_5,
    private val repository19: Repository452_5,
    private val repository20: Repository568_5,
    private val repository21: Repository580_5,
    private val repository22: Repository500_5,
    private val repository23: Repository496_5,
    private val repository24: Repository504_5,
    private val repository25: Repository592_5,
    private val repository26: Repository468_5,
    private val repository27: Repository480_5
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
                            { repository14.getData() },
                            { repository15.getData() },
                            { repository16.getData() },
                            { repository17.getData() },
                            { repository18.getData() },
                            { repository19.getData() },
                            { repository20.getData() },
                            { repository21.getData() },
                            { repository22.getData() },
                            { repository23.getData() },
                            { repository24.getData() },
                            { repository25.getData() },
                            { repository26.getData() },
                            { repository27.getData() }
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