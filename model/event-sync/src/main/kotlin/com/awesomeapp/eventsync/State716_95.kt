package com.awesomeapp.eventsync

sealed class State716_95 {
    data object Loading : State716_95()
    data class Success(val data: String) : State716_95()
    data class Error(val message: String) : State716_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}