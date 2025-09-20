package com.awesomeapp.checkoutsync

sealed class State691_15 {
    data object Loading : State691_15()
    data class Success(val data: String) : State691_15()
    data class Error(val message: String) : State691_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}