package com.awesomeapp.todocheckout

sealed class State232_95 {
    data object Loading : State232_95()
    data class Success(val data: String) : State232_95()
    data class Error(val message: String) : State232_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}