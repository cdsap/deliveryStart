package com.awesomeapp.videoidentity

sealed class State191_45 {
    data object Loading : State191_45()
    data class Success(val data: String) : State191_45()
    data class Error(val message: String) : State191_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}