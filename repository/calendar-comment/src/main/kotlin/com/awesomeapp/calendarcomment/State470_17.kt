package com.awesomeapp.calendarcomment

sealed class State470_17 {
    data object Loading : State470_17()
    data class Success(val data: String) : State470_17()
    data class Error(val message: String) : State470_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}