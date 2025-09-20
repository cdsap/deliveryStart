package com.awesomeapp.loginsync

sealed class State689_36 {
    data object Loading : State689_36()
    data class Success(val data: String) : State689_36()
    data class Error(val message: String) : State689_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}