package com.awesomeapp.timerprofile

sealed class State375_42 {
    data object Loading : State375_42()
    data class Success(val data: String) : State375_42()
    data class Error(val message: String) : State375_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}