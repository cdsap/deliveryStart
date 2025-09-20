package com.awesomeapp.messageprofile

sealed class State361_63 {
    data object Loading : State361_63()
    data class Success(val data: String) : State361_63()
    data class Error(val message: String) : State361_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}