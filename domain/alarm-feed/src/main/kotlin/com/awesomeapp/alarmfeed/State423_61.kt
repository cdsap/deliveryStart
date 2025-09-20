package com.awesomeapp.alarmfeed

sealed class State423_61 {
    data object Loading : State423_61()
    data class Success(val data: String) : State423_61()
    data class Error(val message: String) : State423_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}