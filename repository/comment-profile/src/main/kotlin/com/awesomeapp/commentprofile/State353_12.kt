package com.awesomeapp.commentprofile

sealed class State353_12 {
    data object Loading : State353_12()
    data class Success(val data: String) : State353_12()
    data class Error(val message: String) : State353_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}