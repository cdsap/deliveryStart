package com.awesomeapp.newsnetwork

sealed class State678_85 {
    data object Loading : State678_85()
    data class Success(val data: String) : State678_85()
    data class Error(val message: String) : State678_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}