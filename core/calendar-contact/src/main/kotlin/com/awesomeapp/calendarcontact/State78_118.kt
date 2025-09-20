package com.awesomeapp.calendarcontact

sealed class State78_118 {
    data object Loading : State78_118()
    data class Success(val data: String) : State78_118()
    data class Error(val message: String) : State78_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}