package com.awesomeapp.eventcart

sealed class State275_26 {
    data object Loading : State275_26()
    data class Success(val data: String) : State275_26()
    data class Error(val message: String) : State275_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}