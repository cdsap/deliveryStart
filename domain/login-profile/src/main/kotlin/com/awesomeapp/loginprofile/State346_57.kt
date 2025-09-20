package com.awesomeapp.loginprofile

sealed class State346_57 {
    data object Loading : State346_57()
    data class Success(val data: String) : State346_57()
    data class Error(val message: String) : State346_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}