package com.awesomeapp.loginprofile

sealed class State346_63 {
    data object Loading : State346_63()
    data class Success(val data: String) : State346_63()
    data class Error(val message: String) : State346_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}