package com.awesomeapp.calendarcontact

sealed class State78_73 {
    data object Loading : State78_73()
    data class Success(val data: String) : State78_73()
    data class Error(val message: String) : State78_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}