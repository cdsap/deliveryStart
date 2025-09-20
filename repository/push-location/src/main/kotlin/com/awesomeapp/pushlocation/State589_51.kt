package com.awesomeapp.pushlocation

sealed class State589_51 {
    data object Loading : State589_51()
    data class Success(val data: String) : State589_51()
    data class Error(val message: String) : State589_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}