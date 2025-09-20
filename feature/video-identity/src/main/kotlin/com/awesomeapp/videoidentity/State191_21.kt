package com.awesomeapp.videoidentity

sealed class State191_21 {
    data object Loading : State191_21()
    data class Success(val data: String) : State191_21()
    data class Error(val message: String) : State191_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}