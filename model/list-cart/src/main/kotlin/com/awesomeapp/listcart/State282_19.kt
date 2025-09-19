package com.awesomeapp.listcart

sealed class State282_19 {
    data object Loading : State282_19()
    data class Success(val data: String) : State282_19()
    data class Error(val message: String) : State282_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}