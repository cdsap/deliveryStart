package com.awesomeapp.todocheckout

sealed class State232_44 {
    data object Loading : State232_44()
    data class Success(val data: String) : State232_44()
    data class Error(val message: String) : State232_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}