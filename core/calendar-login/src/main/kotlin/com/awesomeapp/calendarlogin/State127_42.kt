package com.awesomeapp.calendarlogin

sealed class State127_42 {
    data object Loading : State127_42()
    data class Success(val data: String) : State127_42()
    data class Error(val message: String) : State127_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}