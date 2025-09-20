package com.awesomeapp.checkoutcart

sealed class State250_17 {
    data object Loading : State250_17()
    data class Success(val data: String) : State250_17()
    data class Error(val message: String) : State250_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}