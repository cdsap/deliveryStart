package com.awesomeapp.profileshare

sealed class State743_9 {
    data object Loading : State743_9()
    data class Success(val data: String) : State743_9()
    data class Error(val message: String) : State743_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}