package com.awesomeapp.weathersync

sealed class State725_14 {
    data object Loading : State725_14()
    data class Success(val data: String) : State725_14()
    data class Error(val message: String) : State725_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}