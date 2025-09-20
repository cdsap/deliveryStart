package com.awesomeapp.cartcart

sealed class State251_84 {
    data object Loading : State251_84()
    data class Success(val data: String) : State251_84()
    data class Error(val message: String) : State251_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}