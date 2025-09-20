package com.awesomeapp.sharesync

sealed class State702_16 {
    data object Loading : State702_16()
    data class Success(val data: String) : State702_16()
    data class Error(val message: String) : State702_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}