package com.awesomeapp.eventsearch

sealed class State569_15 {
    data object Loading : State569_15()
    data class Success(val data: String) : State569_15()
    data class Error(val message: String) : State569_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}