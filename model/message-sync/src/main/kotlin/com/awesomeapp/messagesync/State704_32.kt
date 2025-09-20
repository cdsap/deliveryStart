package com.awesomeapp.messagesync

sealed class State704_32 {
    data object Loading : State704_32()
    data class Success(val data: String) : State704_32()
    data class Error(val message: String) : State704_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}