package com.awesomeapp.messagefeed

sealed class State410_29 {
    data object Loading : State410_29()
    data class Success(val data: String) : State410_29()
    data class Error(val message: String) : State410_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}