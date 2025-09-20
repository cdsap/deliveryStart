package com.awesomeapp.forecastcheckout

sealed class State236_20 {
    data object Loading : State236_20()
    data class Success(val data: String) : State236_20()
    data class Error(val message: String) : State236_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}