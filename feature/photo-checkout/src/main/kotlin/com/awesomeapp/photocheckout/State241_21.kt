package com.awesomeapp.photocheckout

sealed class State241_21 {
    data object Loading : State241_21()
    data class Success(val data: String) : State241_21()
    data class Error(val message: String) : State241_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}