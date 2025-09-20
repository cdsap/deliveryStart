package com.awesomeapp.forecastcart

sealed class State285_57 {
    data object Loading : State285_57()
    data class Success(val data: String) : State285_57()
    data class Error(val message: String) : State285_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}