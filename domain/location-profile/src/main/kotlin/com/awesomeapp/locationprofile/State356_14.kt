package com.awesomeapp.locationprofile

sealed class State356_14 {
    data object Loading : State356_14()
    data class Success(val data: String) : State356_14()
    data class Error(val message: String) : State356_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}