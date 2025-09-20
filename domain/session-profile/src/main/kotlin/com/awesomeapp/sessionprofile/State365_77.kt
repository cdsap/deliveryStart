package com.awesomeapp.sessionprofile

sealed class State365_77 {
    data object Loading : State365_77()
    data class Success(val data: String) : State365_77()
    data class Error(val message: String) : State365_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}