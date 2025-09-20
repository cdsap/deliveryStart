package com.awesomeapp.podcastsync

sealed class State729_94 {
    data object Loading : State729_94()
    data class Success(val data: String) : State729_94()
    data class Error(val message: String) : State729_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}