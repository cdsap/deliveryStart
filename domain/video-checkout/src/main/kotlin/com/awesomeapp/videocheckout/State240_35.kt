package com.awesomeapp.videocheckout

sealed class State240_35 {
    data object Loading : State240_35()
    data class Success(val data: String) : State240_35()
    data class Error(val message: String) : State240_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}