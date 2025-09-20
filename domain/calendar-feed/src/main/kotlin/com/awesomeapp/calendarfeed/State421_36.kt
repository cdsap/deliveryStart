package com.awesomeapp.calendarfeed

sealed class State421_36 {
    data object Loading : State421_36()
    data class Success(val data: String) : State421_36()
    data class Error(val message: String) : State421_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}