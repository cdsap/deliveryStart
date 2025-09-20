package com.awesomeapp.logfeed

sealed class State417_13 {
    data object Loading : State417_13()
    data class Success(val data: String) : State417_13()
    data class Error(val message: String) : State417_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}