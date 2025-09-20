package com.awesomeapp.notecomment

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
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.playlistprofile.Repository392_5
import com.awesomeapp.groupprofile.Repository360_5
import com.awesomeapp.listprofile.Repository380_5
import com.awesomeapp.locationprofile.Repository356_5
import com.awesomeapp.reportfeed.Repository416_5
import com.awesomeapp.videofeed.Repository436_5
import com.awesomeapp.newsprofile.Repository384_5
import com.awesomeapp.articleuser.Repository336_5
import com.awesomeapp.mapuser.Repository332_5
import com.awesomeapp.forecastfeed.Repository432_5
import com.awesomeapp.profilefeed.Repository400_5
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.settingfeed.Repository412_5
import com.awesomeapp.fileprofile.Repository376_5
import com.awesomeapp.identityfeed.Repository396_5
import com.awesomeapp.logprofile.Repository368_5
import com.awesomeapp.audiofeed.Repository440_5
import com.awesomeapp.accountprofile.Repository364_5
import com.awesomeapp.todofeed.Repository428_5
import com.awesomeapp.timerfeed.Repository424_5
import com.awesomeapp.photoprofile.Repository388_5
import com.awesomeapp.galleryuser.Repository340_5
import com.awesomeapp.searchfeed.Repository404_5
import com.awesomeapp.sharefeed.Repository408_5
import com.awesomeapp.pushprofile.Repository344_5


@HiltViewModel
class Viewmodel476_1 @Inject constructor(
    private val repository0: Repository348_5,
    private val repository1: Repository392_5,
    private val repository2: Repository360_5,
    private val repository3: Repository380_5,
    private val repository4: Repository356_5,
    private val repository5: Repository416_5,
    private val repository6: Repository436_5,
    private val repository7: Repository384_5,
    private val repository8: Repository336_5,
    private val repository9: Repository332_5,
    private val repository10: Repository432_5,
    private val repository11: Repository400_5,
    private val repository12: Repository352_5,
    private val repository13: Repository412_5,
    private val repository14: Repository376_5,
    private val repository15: Repository396_5,
    private val repository16: Repository368_5,
    private val repository17: Repository440_5,
    private val repository18: Repository364_5,
    private val repository19: Repository428_5,
    private val repository20: Repository424_5,
    private val repository21: Repository388_5,
    private val repository22: Repository340_5,
    private val repository23: Repository404_5,
    private val repository24: Repository408_5,
    private val repository25: Repository344_5
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
                            { repository25.getData() }
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