package com.awesomeapp.calendarprofile

sealed class State372_99 {
    data object Loading : State372_99()
    data class Success(val data: String) : State372_99()
    data class Error(val message: String) : State372_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}