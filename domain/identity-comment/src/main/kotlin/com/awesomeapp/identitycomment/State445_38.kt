package com.awesomeapp.identitycomment

sealed class State445_38 {
    data object Loading : State445_38()
    data class Success(val data: String) : State445_38()
    data class Error(val message: String) : State445_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}