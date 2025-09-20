package com.awesomeapp.forecastcomment

sealed class State481_57 {
    data object Loading : State481_57()
    data class Success(val data: String) : State481_57()
    data class Error(val message: String) : State481_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}