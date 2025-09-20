package com.awesomeapp.calendarcontact

sealed class State78_40 {
    data object Loading : State78_40()
    data class Success(val data: String) : State78_40()
    data class Error(val message: String) : State78_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}