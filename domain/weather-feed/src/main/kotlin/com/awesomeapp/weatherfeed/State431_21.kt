package com.awesomeapp.weatherfeed

sealed class State431_21 {
    data object Loading : State431_21()
    data class Success(val data: String) : State431_21()
    data class Error(val message: String) : State431_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}