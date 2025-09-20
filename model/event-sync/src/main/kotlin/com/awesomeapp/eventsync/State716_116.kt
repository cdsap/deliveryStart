package com.awesomeapp.eventsync

sealed class State716_116 {
    data object Loading : State716_116()
    data class Success(val data: String) : State716_116()
    data class Error(val message: String) : State716_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}