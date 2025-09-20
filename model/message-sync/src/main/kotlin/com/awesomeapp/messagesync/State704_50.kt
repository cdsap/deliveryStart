package com.awesomeapp.messagesync

sealed class State704_50 {
    data object Loading : State704_50()
    data class Success(val data: String) : State704_50()
    data class Error(val message: String) : State704_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}