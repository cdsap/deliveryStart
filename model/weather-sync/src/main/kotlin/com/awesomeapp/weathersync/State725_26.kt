package com.awesomeapp.weathersync

sealed class State725_26 {
    data object Loading : State725_26()
    data class Success(val data: String) : State725_26()
    data class Error(val message: String) : State725_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}