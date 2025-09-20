package com.awesomeapp.eventsearch

sealed class State569_27 {
    data object Loading : State569_27()
    data class Success(val data: String) : State569_27()
    data class Error(val message: String) : State569_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}