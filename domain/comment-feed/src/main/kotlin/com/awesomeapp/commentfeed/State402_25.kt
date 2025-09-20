package com.awesomeapp.commentfeed

sealed class State402_25 {
    data object Loading : State402_25()
    data class Success(val data: String) : State402_25()
    data class Error(val message: String) : State402_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}