package com.awesomeapp.checkoutcart

sealed class State250_71 {
    data object Loading : State250_71()
    data class Success(val data: String) : State250_71()
    data class Error(val message: String) : State250_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}