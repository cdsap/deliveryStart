package com.awesomeapp.calendarnetwork

sealed class State666_22 {
    data object Loading : State666_22()
    data class Success(val data: String) : State666_22()
    data class Error(val message: String) : State666_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}