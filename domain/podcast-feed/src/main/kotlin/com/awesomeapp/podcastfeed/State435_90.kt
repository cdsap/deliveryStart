package com.awesomeapp.podcastfeed

sealed class State435_90 {
    data object Loading : State435_90()
    data class Success(val data: String) : State435_90()
    data class Error(val message: String) : State435_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}