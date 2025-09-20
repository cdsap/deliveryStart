package com.awesomeapp.weathersync

sealed class State725_20 {
    data object Loading : State725_20()
    data class Success(val data: String) : State725_20()
    data class Error(val message: String) : State725_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}