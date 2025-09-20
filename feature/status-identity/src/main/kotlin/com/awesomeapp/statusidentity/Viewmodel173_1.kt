package com.awesomeapp.statusidentity

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
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.setting.Repository20_5


@HiltViewModel
class Viewmodel173_1 @Inject constructor(
    private val repository0: Repository88_5,
    private val repository1: Repository12_5,
    private val repository2: Repository8_5,
    private val repository3: Repository52_5,
    private val repository4: Repository72_5,
    private val repository5: Repository112_5,
    private val repository6: Repository124_5,
    private val repository7: Repository116_5,
    private val repository8: Repository148_5,
    private val repository9: Repository120_5,
    private val repository10: Repository132_5,
    private val repository11: Repository20_5
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