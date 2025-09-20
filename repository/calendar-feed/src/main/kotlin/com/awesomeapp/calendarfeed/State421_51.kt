package com.awesomeapp.calendarfeed

sealed class State421_51 {
    data object Loading : State421_51()
    data class Success(val data: String) : State421_51()
    data class Error(val message: String) : State421_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}