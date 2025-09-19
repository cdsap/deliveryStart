package com.awesomeapp.cartcart

sealed class State251_9 {
    data object Loading : State251_9()
    data class Success(val data: String) : State251_9()
    data class Error(val message: String) : State251_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}