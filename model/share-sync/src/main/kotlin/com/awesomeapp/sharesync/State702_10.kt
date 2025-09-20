package com.awesomeapp.sharesync

sealed class State702_10 {
    data object Loading : State702_10()
    data class Success(val data: String) : State702_10()
    data class Error(val message: String) : State702_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}