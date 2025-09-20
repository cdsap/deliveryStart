package com.awesomeapp.eventlogin

sealed class State128_29 {
    data object Loading : State128_29()
    data class Success(val data: String) : State128_29()
    data class Error(val message: String) : State128_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}