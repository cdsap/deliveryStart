package com.awesomeapp.messagelocation

sealed class State606_64 {
    data object Loading : State606_64()
    data class Success(val data: String) : State606_64()
    data class Error(val message: String) : State606_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}