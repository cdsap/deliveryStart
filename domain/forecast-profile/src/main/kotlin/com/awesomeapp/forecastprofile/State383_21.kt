package com.awesomeapp.forecastprofile

sealed class State383_21 {
    data object Loading : State383_21()
    data class Success(val data: String) : State383_21()
    data class Error(val message: String) : State383_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}