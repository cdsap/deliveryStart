package com.awesomeapp.podcastsync

sealed class State729_13 {
    data object Loading : State729_13()
    data class Success(val data: String) : State729_13()
    data class Error(val message: String) : State729_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}