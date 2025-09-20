package com.awesomeapp.commentfeed

sealed class State402_19 {
    data object Loading : State402_19()
    data class Success(val data: String) : State402_19()
    data class Error(val message: String) : State402_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}