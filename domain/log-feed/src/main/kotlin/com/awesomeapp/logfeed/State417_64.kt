package com.awesomeapp.logfeed

sealed class State417_64 {
    data object Loading : State417_64()
    data class Success(val data: String) : State417_64()
    data class Error(val message: String) : State417_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}