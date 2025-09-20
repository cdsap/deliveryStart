package com.awesomeapp.loginsync

sealed class State689_21 {
    data object Loading : State689_21()
    data class Success(val data: String) : State689_21()
    data class Error(val message: String) : State689_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}