package com.awesomeapp.forecastsync

sealed class State726_97 {
    data object Loading : State726_97()
    data class Success(val data: String) : State726_97()
    data class Error(val message: String) : State726_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}