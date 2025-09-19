package com.awesomeapp.accountcart

sealed class State266_12 {
    data object Loading : State266_12()
    data class Success(val data: String) : State266_12()
    data class Error(val message: String) : State266_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}