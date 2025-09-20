package com.awesomeapp.commentfeed

sealed class State402_61 {
    data object Loading : State402_61()
    data class Success(val data: String) : State402_61()
    data class Error(val message: String) : State402_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}