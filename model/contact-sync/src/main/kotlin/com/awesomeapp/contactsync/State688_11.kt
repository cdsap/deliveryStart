package com.awesomeapp.contactsync

sealed class State688_11 {
    data object Loading : State688_11()
    data class Success(val data: String) : State688_11()
    data class Error(val message: String) : State688_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}