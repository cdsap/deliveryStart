package com.awesomeapp.calendaruser

sealed class State323_27 {
    data object Loading : State323_27()
    data class Success(val data: String) : State323_27()
    data class Error(val message: String) : State323_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}