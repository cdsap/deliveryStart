package com.awesomeapp.identitycomment

sealed class State445_53 {
    data object Loading : State445_53()
    data class Success(val data: String) : State445_53()
    data class Error(val message: String) : State445_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}