package com.awesomeapp.contactsync

sealed class State688_41 {
    data object Loading : State688_41()
    data class Success(val data: String) : State688_41()
    data class Error(val message: String) : State688_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}