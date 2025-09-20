package com.awesomeapp.feedsearch

sealed class State548_23 {
    data object Loading : State548_23()
    data class Success(val data: String) : State548_23()
    data class Error(val message: String) : State548_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}