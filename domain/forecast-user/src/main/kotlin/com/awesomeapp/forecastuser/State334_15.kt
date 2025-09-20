package com.awesomeapp.forecastuser

sealed class State334_15 {
    data object Loading : State334_15()
    data class Success(val data: String) : State334_15()
    data class Error(val message: String) : State334_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}