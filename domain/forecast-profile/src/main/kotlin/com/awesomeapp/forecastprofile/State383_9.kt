package com.awesomeapp.forecastprofile

sealed class State383_9 {
    data object Loading : State383_9()
    data class Success(val data: String) : State383_9()
    data class Error(val message: String) : State383_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}