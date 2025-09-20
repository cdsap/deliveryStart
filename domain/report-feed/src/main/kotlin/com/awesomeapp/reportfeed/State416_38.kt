package com.awesomeapp.reportfeed

sealed class State416_38 {
    data object Loading : State416_38()
    data class Success(val data: String) : State416_38()
    data class Error(val message: String) : State416_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}