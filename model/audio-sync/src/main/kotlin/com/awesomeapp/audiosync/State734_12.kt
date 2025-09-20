package com.awesomeapp.audiosync

sealed class State734_12 {
    data object Loading : State734_12()
    data class Success(val data: String) : State734_12()
    data class Error(val message: String) : State734_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}