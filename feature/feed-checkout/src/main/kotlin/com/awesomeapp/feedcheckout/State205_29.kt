package com.awesomeapp.feedcheckout

sealed class State205_29 {
    data object Loading : State205_29()
    data class Success(val data: String) : State205_29()
    data class Error(val message: String) : State205_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}