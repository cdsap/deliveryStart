package com.awesomeapp.newsnetwork

sealed class State678_28 {
    data object Loading : State678_28()
    data class Success(val data: String) : State678_28()
    data class Error(val message: String) : State678_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}