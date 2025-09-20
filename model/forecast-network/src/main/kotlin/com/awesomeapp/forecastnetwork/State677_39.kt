package com.awesomeapp.forecastnetwork

sealed class State677_39 {
    data object Loading : State677_39()
    data class Success(val data: String) : State677_39()
    data class Error(val message: String) : State677_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}