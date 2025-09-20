package com.awesomeapp.accountsync

sealed class State707_5 {
    data object Loading : State707_5()
    data class Success(val data: String) : State707_5()
    data class Error(val message: String) : State707_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}