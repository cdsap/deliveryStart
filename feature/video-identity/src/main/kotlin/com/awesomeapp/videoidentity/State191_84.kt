package com.awesomeapp.videoidentity

sealed class State191_84 {
    data object Loading : State191_84()
    data class Success(val data: String) : State191_84()
    data class Error(val message: String) : State191_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}