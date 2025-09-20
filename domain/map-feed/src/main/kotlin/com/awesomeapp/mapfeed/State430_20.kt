package com.awesomeapp.mapfeed

sealed class State430_20 {
    data object Loading : State430_20()
    data class Success(val data: String) : State430_20()
    data class Error(val message: String) : State430_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}