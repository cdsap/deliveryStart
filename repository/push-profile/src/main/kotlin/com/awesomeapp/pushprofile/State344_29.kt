package com.awesomeapp.pushprofile

sealed class State344_29 {
    data object Loading : State344_29()
    data class Success(val data: String) : State344_29()
    data class Error(val message: String) : State344_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}