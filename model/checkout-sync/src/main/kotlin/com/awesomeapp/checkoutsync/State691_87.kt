package com.awesomeapp.checkoutsync

sealed class State691_87 {
    data object Loading : State691_87()
    data class Success(val data: String) : State691_87()
    data class Error(val message: String) : State691_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}