package com.awesomeapp.analyticscheckout

sealed class State219_31 {
    data object Loading : State219_31()
    data class Success(val data: String) : State219_31()
    data class Error(val message: String) : State219_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}