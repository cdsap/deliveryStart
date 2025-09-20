package com.awesomeapp.playlistprofile

sealed class State392_17 {
    data object Loading : State392_17()
    data class Success(val data: String) : State392_17()
    data class Error(val message: String) : State392_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}