package com.awesomeapp.forecastnetwork

sealed class State677_27 {
    data object Loading : State677_27()
    data class Success(val data: String) : State677_27()
    data class Error(val message: String) : State677_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}