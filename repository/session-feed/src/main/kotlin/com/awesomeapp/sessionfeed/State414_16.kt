package com.awesomeapp.sessionfeed

sealed class State414_16 {
    data object Loading : State414_16()
    data class Success(val data: String) : State414_16()
    data class Error(val message: String) : State414_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}