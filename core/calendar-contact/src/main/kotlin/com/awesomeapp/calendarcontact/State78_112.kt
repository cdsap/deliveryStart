package com.awesomeapp.calendarcontact

sealed class State78_112 {
    data object Loading : State78_112()
    data class Success(val data: String) : State78_112()
    data class Error(val message: String) : State78_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}