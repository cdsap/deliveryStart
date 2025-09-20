package com.awesomeapp.feedcart

sealed class State254_120 {
    data object Loading : State254_120()
    data class Success(val data: String) : State254_120()
    data class Error(val message: String) : State254_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}