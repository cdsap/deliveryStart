package com.awesomeapp.weatherlogin

sealed class State137_42 {
    data object Loading : State137_42()
    data class Success(val data: String) : State137_42()
    data class Error(val message: String) : State137_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}