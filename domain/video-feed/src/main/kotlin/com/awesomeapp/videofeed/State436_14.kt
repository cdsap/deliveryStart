package com.awesomeapp.videofeed

sealed class State436_14 {
    data object Loading : State436_14()
    data class Success(val data: String) : State436_14()
    data class Error(val message: String) : State436_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}