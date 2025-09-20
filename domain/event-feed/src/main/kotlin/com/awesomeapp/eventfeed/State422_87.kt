package com.awesomeapp.eventfeed

sealed class State422_87 {
    data object Loading : State422_87()
    data class Success(val data: String) : State422_87()
    data class Error(val message: String) : State422_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}