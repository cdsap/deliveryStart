package com.awesomeapp.synccheckout

sealed class State211_117 {
    data object Loading : State211_117()
    data class Success(val data: String) : State211_117()
    data class Error(val message: String) : State211_117()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}