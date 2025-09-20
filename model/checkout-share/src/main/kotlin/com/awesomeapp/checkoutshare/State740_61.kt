package com.awesomeapp.checkoutshare

sealed class State740_61 {
    data object Loading : State740_61()
    data class Success(val data: String) : State740_61()
    data class Error(val message: String) : State740_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}