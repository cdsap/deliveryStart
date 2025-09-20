package com.awesomeapp.messagenetwork

sealed class State655_20 {
    data object Loading : State655_20()
    data class Success(val data: String) : State655_20()
    data class Error(val message: String) : State655_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}