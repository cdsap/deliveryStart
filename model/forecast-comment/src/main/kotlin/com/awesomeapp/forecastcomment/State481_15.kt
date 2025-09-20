package com.awesomeapp.forecastcomment

sealed class State481_15 {
    data object Loading : State481_15()
    data class Success(val data: String) : State481_15()
    data class Error(val message: String) : State481_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}