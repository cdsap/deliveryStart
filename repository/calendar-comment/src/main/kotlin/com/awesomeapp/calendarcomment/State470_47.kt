package com.awesomeapp.calendarcomment

sealed class State470_47 {
    data object Loading : State470_47()
    data class Success(val data: String) : State470_47()
    data class Error(val message: String) : State470_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}