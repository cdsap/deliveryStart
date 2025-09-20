package com.awesomeapp.profileshare

sealed class State743_75 {
    data object Loading : State743_75()
    data class Success(val data: String) : State743_75()
    data class Error(val message: String) : State743_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}