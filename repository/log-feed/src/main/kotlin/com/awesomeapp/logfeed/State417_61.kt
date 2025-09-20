package com.awesomeapp.logfeed

sealed class State417_61 {
    data object Loading : State417_61()
    data class Success(val data: String) : State417_61()
    data class Error(val message: String) : State417_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}