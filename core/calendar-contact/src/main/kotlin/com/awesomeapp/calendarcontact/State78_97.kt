package com.awesomeapp.calendarcontact

sealed class State78_97 {
    data object Loading : State78_97()
    data class Success(val data: String) : State78_97()
    data class Error(val message: String) : State78_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}