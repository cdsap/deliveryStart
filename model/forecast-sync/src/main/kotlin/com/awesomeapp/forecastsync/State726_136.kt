package com.awesomeapp.forecastsync

sealed class State726_136 {
    data object Loading : State726_136()
    data class Success(val data: String) : State726_136()
    data class Error(val message: String) : State726_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}