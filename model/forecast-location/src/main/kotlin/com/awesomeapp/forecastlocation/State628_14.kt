package com.awesomeapp.forecastlocation

sealed class State628_14 {
    data object Loading : State628_14()
    data class Success(val data: String) : State628_14()
    data class Error(val message: String) : State628_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}