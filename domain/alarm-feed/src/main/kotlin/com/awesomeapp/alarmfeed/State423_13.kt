package com.awesomeapp.alarmfeed

sealed class State423_13 {
    data object Loading : State423_13()
    data class Success(val data: String) : State423_13()
    data class Error(val message: String) : State423_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}