package com.awesomeapp.analyticscheckout

sealed class State219_82 {
    data object Loading : State219_82()
    data class Success(val data: String) : State219_82()
    data class Error(val message: String) : State219_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}