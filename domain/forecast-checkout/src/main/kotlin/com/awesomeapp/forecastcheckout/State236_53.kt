package com.awesomeapp.forecastcheckout

sealed class State236_53 {
    data object Loading : State236_53()
    data class Success(val data: String) : State236_53()
    data class Error(val message: String) : State236_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}