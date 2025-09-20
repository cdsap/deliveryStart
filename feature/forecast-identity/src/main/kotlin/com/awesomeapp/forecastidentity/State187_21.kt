package com.awesomeapp.forecastidentity

sealed class State187_21 {
    data object Loading : State187_21()
    data class Success(val data: String) : State187_21()
    data class Error(val message: String) : State187_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}