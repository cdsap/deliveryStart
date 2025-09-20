package com.awesomeapp.analyticscheckout

sealed class State219_73 {
    data object Loading : State219_73()
    data class Success(val data: String) : State219_73()
    data class Error(val message: String) : State219_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}