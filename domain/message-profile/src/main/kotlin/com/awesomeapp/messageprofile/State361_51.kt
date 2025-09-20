package com.awesomeapp.messageprofile

sealed class State361_51 {
    data object Loading : State361_51()
    data class Success(val data: String) : State361_51()
    data class Error(val message: String) : State361_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}