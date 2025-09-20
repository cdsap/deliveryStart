package com.awesomeapp.syncsync

sealed class State701_57 {
    data object Loading : State701_57()
    data class Success(val data: String) : State701_57()
    data class Error(val message: String) : State701_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}