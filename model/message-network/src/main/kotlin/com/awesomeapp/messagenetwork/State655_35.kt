package com.awesomeapp.messagenetwork

sealed class State655_35 {
    data object Loading : State655_35()
    data class Success(val data: String) : State655_35()
    data class Error(val message: String) : State655_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}