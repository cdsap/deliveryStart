package com.awesomeapp.playlistnetwork

sealed class State686_33 {
    data object Loading : State686_33()
    data class Success(val data: String) : State686_33()
    data class Error(val message: String) : State686_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}