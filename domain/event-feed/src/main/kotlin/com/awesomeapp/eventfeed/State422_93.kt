package com.awesomeapp.eventfeed

sealed class State422_93 {
    data object Loading : State422_93()
    data class Success(val data: String) : State422_93()
    data class Error(val message: String) : State422_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}