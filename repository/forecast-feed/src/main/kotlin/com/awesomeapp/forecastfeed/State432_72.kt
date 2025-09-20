package com.awesomeapp.forecastfeed

sealed class State432_72 {
    data object Loading : State432_72()
    data class Success(val data: String) : State432_72()
    data class Error(val message: String) : State432_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}