package com.awesomeapp.cartcart

sealed class State251_93 {
    data object Loading : State251_93()
    data class Success(val data: String) : State251_93()
    data class Error(val message: String) : State251_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}