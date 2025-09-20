package com.awesomeapp.playlistcheckout

sealed class State245_62 {
    data object Loading : State245_62()
    data class Success(val data: String) : State245_62()
    data class Error(val message: String) : State245_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}