package com.awesomeapp.playlistcheckout

sealed class State245_20 {
    data object Loading : State245_20()
    data class Success(val data: String) : State245_20()
    data class Error(val message: String) : State245_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}