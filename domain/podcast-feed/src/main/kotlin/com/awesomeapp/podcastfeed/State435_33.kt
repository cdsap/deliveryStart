package com.awesomeapp.podcastfeed

sealed class State435_33 {
    data object Loading : State435_33()
    data class Success(val data: String) : State435_33()
    data class Error(val message: String) : State435_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}