package com.awesomeapp.playlistprofile

sealed class State392_38 {
    data object Loading : State392_38()
    data class Success(val data: String) : State392_38()
    data class Error(val message: String) : State392_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}