package com.awesomeapp.weatherprofile

sealed class State382_75 {
    data object Loading : State382_75()
    data class Success(val data: String) : State382_75()
    data class Error(val message: String) : State382_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}