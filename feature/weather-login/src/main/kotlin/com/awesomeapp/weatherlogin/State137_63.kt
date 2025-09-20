package com.awesomeapp.weatherlogin

sealed class State137_63 {
    data object Loading : State137_63()
    data class Success(val data: String) : State137_63()
    data class Error(val message: String) : State137_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}