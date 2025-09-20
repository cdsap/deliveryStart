package com.awesomeapp.photocheckout

sealed class State241_9 {
    data object Loading : State241_9()
    data class Success(val data: String) : State241_9()
    data class Error(val message: String) : State241_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}