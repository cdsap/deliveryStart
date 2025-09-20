package com.awesomeapp.messagefeed

sealed class State410_104 {
    data object Loading : State410_104()
    data class Success(val data: String) : State410_104()
    data class Error(val message: String) : State410_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}