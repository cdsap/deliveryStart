package com.awesomeapp.forecastnetwork

sealed class State677_21 {
    data object Loading : State677_21()
    data class Success(val data: String) : State677_21()
    data class Error(val message: String) : State677_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}