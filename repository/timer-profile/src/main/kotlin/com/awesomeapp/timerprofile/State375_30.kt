package com.awesomeapp.timerprofile

sealed class State375_30 {
    data object Loading : State375_30()
    data class Success(val data: String) : State375_30()
    data class Error(val message: String) : State375_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}