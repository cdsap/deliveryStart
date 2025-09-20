package com.awesomeapp.eventsearch

sealed class State569_42 {
    data object Loading : State569_42()
    data class Success(val data: String) : State569_42()
    data class Error(val message: String) : State569_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}