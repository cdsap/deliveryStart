package com.awesomeapp.identitycomment

sealed class State445_77 {
    data object Loading : State445_77()
    data class Success(val data: String) : State445_77()
    data class Error(val message: String) : State445_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}