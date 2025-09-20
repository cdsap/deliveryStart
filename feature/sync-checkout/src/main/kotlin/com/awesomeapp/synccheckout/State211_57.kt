package com.awesomeapp.synccheckout

sealed class State211_57 {
    data object Loading : State211_57()
    data class Success(val data: String) : State211_57()
    data class Error(val message: String) : State211_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}