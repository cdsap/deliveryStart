package com.awesomeapp.feedfeed

sealed class State401_63 {
    data object Loading : State401_63()
    data class Success(val data: String) : State401_63()
    data class Error(val message: String) : State401_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}