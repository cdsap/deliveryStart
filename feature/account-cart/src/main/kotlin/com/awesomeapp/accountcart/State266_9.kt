package com.awesomeapp.accountcart

sealed class State266_9 {
    data object Loading : State266_9()
    data class Success(val data: String) : State266_9()
    data class Error(val message: String) : State266_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}