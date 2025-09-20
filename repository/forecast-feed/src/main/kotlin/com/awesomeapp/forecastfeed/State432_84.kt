package com.awesomeapp.forecastfeed

sealed class State432_84 {
    data object Loading : State432_84()
    data class Success(val data: String) : State432_84()
    data class Error(val message: String) : State432_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}