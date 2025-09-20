package com.awesomeapp.playlistcomment

sealed class State490_47 {
    data object Loading : State490_47()
    data class Success(val data: String) : State490_47()
    data class Error(val message: String) : State490_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}