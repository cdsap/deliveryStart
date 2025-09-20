package com.awesomeapp.weatherprofile

sealed class State382_18 {
    data object Loading : State382_18()
    data class Success(val data: String) : State382_18()
    data class Error(val message: String) : State382_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}