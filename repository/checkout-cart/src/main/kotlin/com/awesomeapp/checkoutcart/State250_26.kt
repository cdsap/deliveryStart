package com.awesomeapp.checkoutcart

sealed class State250_26 {
    data object Loading : State250_26()
    data class Success(val data: String) : State250_26()
    data class Error(val message: String) : State250_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}