package com.awesomeapp.calendaruser

sealed class State323_72 {
    data object Loading : State323_72()
    data class Success(val data: String) : State323_72()
    data class Error(val message: String) : State323_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}