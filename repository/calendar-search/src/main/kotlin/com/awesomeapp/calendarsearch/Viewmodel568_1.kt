package com.awesomeapp.calendarsearch

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
import com.awesomeapp.accountprofile.Repository364_5
import com.awesomeapp.pushprofile.Repository344_5
import com.awesomeapp.logprofile.Repository368_5
import com.awesomeapp.timerfeed.Repository424_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.logincomment.Repository444_5
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.galleryuser.Repository340_5
import com.awesomeapp.photoprofile.Repository388_5
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.videofeed.Repository436_5


@HiltViewModel
class Viewmodel568_1 @Inject constructor(
    private val repository0: Repository364_5,
    private val repository1: Repository344_5,
    private val repository2: Repository368_5,
    private val repository3: Repository424_5,
    private val repository4: Repository304_5,
    private val repository5: Repository308_5,
    private val repository6: Repository444_5,
    private val repository7: Repository372_5,
    private val repository8: Repository352_5,
    private val repository9: Repository340_5,
    private val repository10: Repository388_5,
    private val repository11: Repository328_5,
    private val repository12: Repository436_5
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
                            { repository12.getData() }
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