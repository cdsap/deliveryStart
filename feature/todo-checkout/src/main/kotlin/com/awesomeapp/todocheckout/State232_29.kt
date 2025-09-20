package com.awesomeapp.todocheckout

sealed class State232_29 {
    data object Loading : State232_29()
    data class Success(val data: String) : State232_29()
    data class Error(val message: String) : State232_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}