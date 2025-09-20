package com.awesomeapp.calendarcontact

sealed class State78_25 {
    data object Loading : State78_25()
    data class Success(val data: String) : State78_25()
    data class Error(val message: String) : State78_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}