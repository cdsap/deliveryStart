package com.awesomeapp.forecastfeed

sealed class State432_93 {
    data object Loading : State432_93()
    data class Success(val data: String) : State432_93()
    data class Error(val message: String) : State432_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}