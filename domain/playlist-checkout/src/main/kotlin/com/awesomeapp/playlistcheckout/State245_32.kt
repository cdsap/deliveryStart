package com.awesomeapp.playlistcheckout

sealed class State245_32 {
    data object Loading : State245_32()
    data class Success(val data: String) : State245_32()
    data class Error(val message: String) : State245_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}