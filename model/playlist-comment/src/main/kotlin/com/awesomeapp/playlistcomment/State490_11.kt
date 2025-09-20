package com.awesomeapp.playlistcomment

sealed class State490_11 {
    data object Loading : State490_11()
    data class Success(val data: String) : State490_11()
    data class Error(val message: String) : State490_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}