package com.awesomeapp.userprofile

sealed class State350_26 {
    data object Loading : State350_26()
    data class Success(val data: String) : State350_26()
    data class Error(val message: String) : State350_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}