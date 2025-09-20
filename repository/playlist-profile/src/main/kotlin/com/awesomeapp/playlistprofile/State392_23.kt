package com.awesomeapp.playlistprofile

sealed class State392_23 {
    data object Loading : State392_23()
    data class Success(val data: String) : State392_23()
    data class Error(val message: String) : State392_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}