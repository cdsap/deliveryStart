package com.awesomeapp.podcastfeed

sealed class State435_99 {
    data object Loading : State435_99()
    data class Success(val data: String) : State435_99()
    data class Error(val message: String) : State435_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}