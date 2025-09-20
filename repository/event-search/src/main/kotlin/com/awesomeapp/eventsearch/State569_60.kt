package com.awesomeapp.eventsearch

sealed class State569_60 {
    data object Loading : State569_60()
    data class Success(val data: String) : State569_60()
    data class Error(val message: String) : State569_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}