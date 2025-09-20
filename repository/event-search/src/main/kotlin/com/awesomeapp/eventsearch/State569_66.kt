package com.awesomeapp.eventsearch

sealed class State569_66 {
    data object Loading : State569_66()
    data class Success(val data: String) : State569_66()
    data class Error(val message: String) : State569_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}