package com.awesomeapp.forecastcart

sealed class State285_81 {
    data object Loading : State285_81()
    data class Success(val data: String) : State285_81()
    data class Error(val message: String) : State285_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}