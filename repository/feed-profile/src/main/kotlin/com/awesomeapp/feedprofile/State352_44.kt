package com.awesomeapp.feedprofile

sealed class State352_44 {
    data object Loading : State352_44()
    data class Success(val data: String) : State352_44()
    data class Error(val message: String) : State352_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}