package com.awesomeapp.feedshare

sealed class State744_51 {
    data object Loading : State744_51()
    data class Success(val data: String) : State744_51()
    data class Error(val message: String) : State744_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}