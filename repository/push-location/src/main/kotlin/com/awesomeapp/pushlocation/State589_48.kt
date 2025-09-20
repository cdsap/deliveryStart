package com.awesomeapp.pushlocation

sealed class State589_48 {
    data object Loading : State589_48()
    data class Success(val data: String) : State589_48()
    data class Error(val message: String) : State589_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}