package com.awesomeapp.sessionprofile

sealed class State365_110 {
    data object Loading : State365_110()
    data class Success(val data: String) : State365_110()
    data class Error(val message: String) : State365_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}