package com.awesomeapp.weathersearch

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
import com.awesomeapp.photoprofile.Repository388_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.fileprofile.Repository376_5
import com.awesomeapp.forecastfeed.Repository432_5
import com.awesomeapp.messageuser.Repository312_5
import com.awesomeapp.logprofile.Repository368_5
import com.awesomeapp.searchfeed.Repository404_5
import com.awesomeapp.mapuser.Repository332_5
import com.awesomeapp.logincomment.Repository444_5
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.accountprofile.Repository364_5
import com.awesomeapp.groupprofile.Repository360_5


@HiltViewModel
class Viewmodel578_1 @Inject constructor(
    private val repository0: Repository388_5,
    private val repository1: Repository304_5,
    private val repository2: Repository376_5,
    private val repository3: Repository432_5,
    private val repository4: Repository312_5,
    private val repository5: Repository368_5,
    private val repository6: Repository404_5,
    private val repository7: Repository332_5,
    private val repository8: Repository444_5,
    private val repository9: Repository348_5,
    private val repository10: Repository372_5,
    private val repository11: Repository364_5,
    private val repository12: Repository360_5
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