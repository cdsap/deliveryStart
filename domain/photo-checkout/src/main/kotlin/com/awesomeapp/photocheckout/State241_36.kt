package com.awesomeapp.photocheckout

sealed class State241_36 {
    data object Loading : State241_36()
    data class Success(val data: String) : State241_36()
    data class Error(val message: String) : State241_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}