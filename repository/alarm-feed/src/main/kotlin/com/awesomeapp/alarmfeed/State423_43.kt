package com.awesomeapp.alarmfeed

sealed class State423_43 {
    data object Loading : State423_43()
    data class Success(val data: String) : State423_43()
    data class Error(val message: String) : State423_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}