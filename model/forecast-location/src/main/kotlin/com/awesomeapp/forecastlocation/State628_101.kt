package com.awesomeapp.forecastlocation

sealed class State628_101 {
    data object Loading : State628_101()
    data class Success(val data: String) : State628_101()
    data class Error(val message: String) : State628_101()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}