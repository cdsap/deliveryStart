package com.awesomeapp.feedsearch

sealed class State548_29 {
    data object Loading : State548_29()
    data class Success(val data: String) : State548_29()
    data class Error(val message: String) : State548_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}