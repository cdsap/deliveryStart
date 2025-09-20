package com.awesomeapp.logfeed

sealed class State417_28 {
    data object Loading : State417_28()
    data class Success(val data: String) : State417_28()
    data class Error(val message: String) : State417_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}