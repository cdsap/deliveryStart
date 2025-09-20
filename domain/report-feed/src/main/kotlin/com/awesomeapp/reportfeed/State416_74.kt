package com.awesomeapp.reportfeed

sealed class State416_74 {
    data object Loading : State416_74()
    data class Success(val data: String) : State416_74()
    data class Error(val message: String) : State416_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}