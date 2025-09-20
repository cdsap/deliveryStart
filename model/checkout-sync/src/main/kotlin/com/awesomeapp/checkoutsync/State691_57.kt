package com.awesomeapp.checkoutsync

sealed class State691_57 {
    data object Loading : State691_57()
    data class Success(val data: String) : State691_57()
    data class Error(val message: String) : State691_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}