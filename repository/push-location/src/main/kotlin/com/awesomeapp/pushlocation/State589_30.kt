package com.awesomeapp.pushlocation

sealed class State589_30 {
    data object Loading : State589_30()
    data class Success(val data: String) : State589_30()
    data class Error(val message: String) : State589_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}