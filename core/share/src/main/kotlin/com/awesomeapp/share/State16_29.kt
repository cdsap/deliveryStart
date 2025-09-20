package com.awesomeapp.share

sealed class State16_29 {
    data object Loading : State16_29()
    data class Success(val data: String) : State16_29()
    data class Error(val message: String) : State16_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}