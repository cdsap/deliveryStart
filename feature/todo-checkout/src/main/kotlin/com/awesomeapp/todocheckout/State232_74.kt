package com.awesomeapp.todocheckout

sealed class State232_74 {
    data object Loading : State232_74()
    data class Success(val data: String) : State232_74()
    data class Error(val message: String) : State232_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}