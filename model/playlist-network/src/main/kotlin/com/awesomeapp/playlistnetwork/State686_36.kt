package com.awesomeapp.playlistnetwork

sealed class State686_36 {
    data object Loading : State686_36()
    data class Success(val data: String) : State686_36()
    data class Error(val message: String) : State686_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}