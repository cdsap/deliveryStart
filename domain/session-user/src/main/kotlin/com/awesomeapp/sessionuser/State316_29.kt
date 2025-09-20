package com.awesomeapp.sessionuser

sealed class State316_29 {
    data object Loading : State316_29()
    data class Success(val data: String) : State316_29()
    data class Error(val message: String) : State316_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}