package com.awesomeapp.profileprofile

sealed class State351_64 {
    data object Loading : State351_64()
    data class Success(val data: String) : State351_64()
    data class Error(val message: String) : State351_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}