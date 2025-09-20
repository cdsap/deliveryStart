package com.awesomeapp.calendarnetwork

sealed class State666_28 {
    data object Loading : State666_28()
    data class Success(val data: String) : State666_28()
    data class Error(val message: String) : State666_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}