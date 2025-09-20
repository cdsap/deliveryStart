package com.awesomeapp.postfeed

sealed class State403_12 {
    data object Loading : State403_12()
    data class Success(val data: String) : State403_12()
    data class Error(val message: String) : State403_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}