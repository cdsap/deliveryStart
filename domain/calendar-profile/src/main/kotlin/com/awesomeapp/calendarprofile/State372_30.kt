package com.awesomeapp.calendarprofile

sealed class State372_30 {
    data object Loading : State372_30()
    data class Success(val data: String) : State372_30()
    data class Error(val message: String) : State372_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}