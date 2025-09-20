package com.awesomeapp.commentfeed

sealed class State402_40 {
    data object Loading : State402_40()
    data class Success(val data: String) : State402_40()
    data class Error(val message: String) : State402_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}