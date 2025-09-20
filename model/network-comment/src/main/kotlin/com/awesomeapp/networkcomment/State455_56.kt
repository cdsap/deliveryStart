package com.awesomeapp.networkcomment

sealed class State455_56 {
    data object Loading : State455_56()
    data class Success(val data: String) : State455_56()
    data class Error(val message: String) : State455_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}