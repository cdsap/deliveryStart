package com.awesomeapp.loginpost

sealed class State493_84 {
    data object Loading : State493_84()
    data class Success(val data: String) : State493_84()
    data class Error(val message: String) : State493_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}