package com.awesomeapp.weatherlogin

sealed class State137_24 {
    data object Loading : State137_24()
    data class Success(val data: String) : State137_24()
    data class Error(val message: String) : State137_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}