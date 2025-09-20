package com.awesomeapp.locationshare

sealed class State748_41 {
    data object Loading : State748_41()
    data class Success(val data: String) : State748_41()
    data class Error(val message: String) : State748_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}