package com.awesomeapp.feedlocation

sealed class State597_127 {
    data object Loading : State597_127()
    data class Success(val data: String) : State597_127()
    data class Error(val message: String) : State597_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}