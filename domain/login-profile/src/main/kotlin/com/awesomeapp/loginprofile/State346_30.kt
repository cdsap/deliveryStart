package com.awesomeapp.loginprofile

sealed class State346_30 {
    data object Loading : State346_30()
    data class Success(val data: String) : State346_30()
    data class Error(val message: String) : State346_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}