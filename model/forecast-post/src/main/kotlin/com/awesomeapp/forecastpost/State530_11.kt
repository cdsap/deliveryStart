package com.awesomeapp.forecastpost

sealed class State530_11 {
    data object Loading : State530_11()
    data class Success(val data: String) : State530_11()
    data class Error(val message: String) : State530_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}