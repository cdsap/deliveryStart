package com.awesomeapp.locationshare

sealed class State748_23 {
    data object Loading : State748_23()
    data class Success(val data: String) : State748_23()
    data class Error(val message: String) : State748_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}