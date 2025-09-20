package com.awesomeapp.feedlocation

sealed class State597_40 {
    data object Loading : State597_40()
    data class Success(val data: String) : State597_40()
    data class Error(val message: String) : State597_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}