package com.awesomeapp.feedshare

sealed class State744_12 {
    data object Loading : State744_12()
    data class Success(val data: String) : State744_12()
    data class Error(val message: String) : State744_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}