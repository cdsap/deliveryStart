package com.awesomeapp.calendaruser

sealed class State323_63 {
    data object Loading : State323_63()
    data class Success(val data: String) : State323_63()
    data class Error(val message: String) : State323_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}