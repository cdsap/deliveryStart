package com.awesomeapp.alarmfeed

sealed class State423_49 {
    data object Loading : State423_49()
    data class Success(val data: String) : State423_49()
    data class Error(val message: String) : State423_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}