package com.awesomeapp.identityprofile

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
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.notificationcart.Repository264_5
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.statususer.Repository320_5
import com.awesomeapp.logincart.Repository248_5
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.postcart.Repository256_5


@HiltViewModel
class Viewmodel347_1 @Inject constructor(
    private val repository0: Repository268_5,
    private val repository1: Repository308_5,
    private val repository2: Repository244_5,
    private val repository3: Repository264_5,
    private val repository4: Repository240_5,
    private val repository5: Repository320_5,
    private val repository6: Repository248_5,
    private val repository7: Repository328_5,
    private val repository8: Repository304_5,
    private val repository9: Repository288_5,
    private val repository10: Repository292_5,
    private val repository11: Repository256_5
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
                            { repository11.getData() }
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