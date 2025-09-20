package com.awesomeapp.messagelocation

sealed class State606_55 {
    data object Loading : State606_55()
    data class Success(val data: String) : State606_55()
    data class Error(val message: String) : State606_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}