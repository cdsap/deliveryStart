package com.awesomeapp.audiosync

sealed class State734_21 {
    data object Loading : State734_21()
    data class Success(val data: String) : State734_21()
    data class Error(val message: String) : State734_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}