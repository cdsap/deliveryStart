package com.awesomeapp.accountsync

sealed class State707_123 {
    data object Loading : State707_123()
    data class Success(val data: String) : State707_123()
    data class Error(val message: String) : State707_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}