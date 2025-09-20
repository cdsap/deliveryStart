package com.awesomeapp.reportfeed

sealed class State416_17 {
    data object Loading : State416_17()
    data class Success(val data: String) : State416_17()
    data class Error(val message: String) : State416_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}