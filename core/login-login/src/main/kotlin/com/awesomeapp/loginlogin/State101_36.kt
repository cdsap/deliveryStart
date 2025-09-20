package com.awesomeapp.loginlogin

sealed class State101_36 {
    data object Loading : State101_36()
    data class Success(val data: String) : State101_36()
    data class Error(val message: String) : State101_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}