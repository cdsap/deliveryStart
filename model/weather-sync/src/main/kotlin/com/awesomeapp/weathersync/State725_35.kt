package com.awesomeapp.weathersync

sealed class State725_35 {
    data object Loading : State725_35()
    data class Success(val data: String) : State725_35()
    data class Error(val message: String) : State725_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}