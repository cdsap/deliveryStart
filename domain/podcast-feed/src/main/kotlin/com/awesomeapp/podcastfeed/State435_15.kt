package com.awesomeapp.podcastfeed

sealed class State435_15 {
    data object Loading : State435_15()
    data class Success(val data: String) : State435_15()
    data class Error(val message: String) : State435_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}