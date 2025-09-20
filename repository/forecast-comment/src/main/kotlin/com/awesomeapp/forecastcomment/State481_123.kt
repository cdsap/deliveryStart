package com.awesomeapp.forecastcomment

sealed class State481_123 {
    data object Loading : State481_123()
    data class Success(val data: String) : State481_123()
    data class Error(val message: String) : State481_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}