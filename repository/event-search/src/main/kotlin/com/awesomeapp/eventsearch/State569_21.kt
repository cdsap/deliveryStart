package com.awesomeapp.eventsearch

sealed class State569_21 {
    data object Loading : State569_21()
    data class Success(val data: String) : State569_21()
    data class Error(val message: String) : State569_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}