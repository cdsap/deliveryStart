package com.awesomeapp.reportfeed

sealed class State416_53 {
    data object Loading : State416_53()
    data class Success(val data: String) : State416_53()
    data class Error(val message: String) : State416_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}