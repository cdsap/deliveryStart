package com.awesomeapp.calendaruser

sealed class State323_54 {
    data object Loading : State323_54()
    data class Success(val data: String) : State323_54()
    data class Error(val message: String) : State323_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}