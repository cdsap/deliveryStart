package com.awesomeapp.accountfeed

sealed class State413_21 {
    data object Loading : State413_21()
    data class Success(val data: String) : State413_21()
    data class Error(val message: String) : State413_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}