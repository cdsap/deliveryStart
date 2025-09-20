package com.awesomeapp.statuscart

sealed class State271_12 {
    data object Loading : State271_12()
    data class Success(val data: String) : State271_12()
    data class Error(val message: String) : State271_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}