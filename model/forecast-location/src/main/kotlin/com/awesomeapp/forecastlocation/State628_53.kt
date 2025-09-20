package com.awesomeapp.forecastlocation

sealed class State628_53 {
    data object Loading : State628_53()
    data class Success(val data: String) : State628_53()
    data class Error(val message: String) : State628_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}