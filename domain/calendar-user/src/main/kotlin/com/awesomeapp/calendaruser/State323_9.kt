package com.awesomeapp.calendaruser

sealed class State323_9 {
    data object Loading : State323_9()
    data class Success(val data: String) : State323_9()
    data class Error(val message: String) : State323_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}