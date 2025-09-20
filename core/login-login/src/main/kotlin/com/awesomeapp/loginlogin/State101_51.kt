package com.awesomeapp.loginlogin

sealed class State101_51 {
    data object Loading : State101_51()
    data class Success(val data: String) : State101_51()
    data class Error(val message: String) : State101_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}