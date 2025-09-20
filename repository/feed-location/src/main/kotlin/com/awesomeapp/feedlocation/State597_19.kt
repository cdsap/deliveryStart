package com.awesomeapp.feedlocation

sealed class State597_19 {
    data object Loading : State597_19()
    data class Success(val data: String) : State597_19()
    data class Error(val message: String) : State597_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}