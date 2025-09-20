package com.awesomeapp.contactsync

sealed class State688_26 {
    data object Loading : State688_26()
    data class Success(val data: String) : State688_26()
    data class Error(val message: String) : State688_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}