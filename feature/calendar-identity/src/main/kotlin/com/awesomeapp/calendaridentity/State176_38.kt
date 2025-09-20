package com.awesomeapp.calendaridentity

sealed class State176_38 {
    data object Loading : State176_38()
    data class Success(val data: String) : State176_38()
    data class Error(val message: String) : State176_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}