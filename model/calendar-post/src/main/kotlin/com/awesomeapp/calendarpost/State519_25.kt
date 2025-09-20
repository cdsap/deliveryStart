package com.awesomeapp.calendarpost

sealed class State519_25 {
    data object Loading : State519_25()
    data class Success(val data: String) : State519_25()
    data class Error(val message: String) : State519_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}