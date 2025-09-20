package com.awesomeapp.feedlocation

sealed class State597_85 {
    data object Loading : State597_85()
    data class Success(val data: String) : State597_85()
    data class Error(val message: String) : State597_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}