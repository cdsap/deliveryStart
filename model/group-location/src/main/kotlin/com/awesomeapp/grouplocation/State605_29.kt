package com.awesomeapp.grouplocation

sealed class State605_29 {
    data object Loading : State605_29()
    data class Success(val data: String) : State605_29()
    data class Error(val message: String) : State605_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}