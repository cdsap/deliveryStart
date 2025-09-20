package com.awesomeapp.timerprofile

sealed class State375_36 {
    data object Loading : State375_36()
    data class Success(val data: String) : State375_36()
    data class Error(val message: String) : State375_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}