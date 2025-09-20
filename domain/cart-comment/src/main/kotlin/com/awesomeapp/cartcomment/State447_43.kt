package com.awesomeapp.cartcomment

sealed class State447_43 {
    data object Loading : State447_43()
    data class Success(val data: String) : State447_43()
    data class Error(val message: String) : State447_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}