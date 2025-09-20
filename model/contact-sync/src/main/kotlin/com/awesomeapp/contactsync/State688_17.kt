package com.awesomeapp.contactsync

sealed class State688_17 {
    data object Loading : State688_17()
    data class Success(val data: String) : State688_17()
    data class Error(val message: String) : State688_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}