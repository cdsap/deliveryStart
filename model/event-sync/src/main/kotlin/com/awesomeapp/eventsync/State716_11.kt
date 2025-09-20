package com.awesomeapp.eventsync

sealed class State716_11 {
    data object Loading : State716_11()
    data class Success(val data: String) : State716_11()
    data class Error(val message: String) : State716_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}