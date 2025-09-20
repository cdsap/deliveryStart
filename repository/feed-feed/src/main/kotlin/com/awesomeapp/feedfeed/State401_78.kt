package com.awesomeapp.feedfeed

sealed class State401_78 {
    data object Loading : State401_78()
    data class Success(val data: String) : State401_78()
    data class Error(val message: String) : State401_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}