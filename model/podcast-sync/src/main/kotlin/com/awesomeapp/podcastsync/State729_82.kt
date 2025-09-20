package com.awesomeapp.podcastsync

sealed class State729_82 {
    data object Loading : State729_82()
    data class Success(val data: String) : State729_82()
    data class Error(val message: String) : State729_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}