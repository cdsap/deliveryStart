package com.awesomeapp.audiofeed

sealed class State440_52 {
    data object Loading : State440_52()
    data class Success(val data: String) : State440_52()
    data class Error(val message: String) : State440_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}