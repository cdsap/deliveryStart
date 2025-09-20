package com.awesomeapp.messagefeed

sealed class State410_11 {
    data object Loading : State410_11()
    data class Success(val data: String) : State410_11()
    data class Error(val message: String) : State410_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}