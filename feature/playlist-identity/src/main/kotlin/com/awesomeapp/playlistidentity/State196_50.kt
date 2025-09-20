package com.awesomeapp.playlistidentity

sealed class State196_50 {
    data object Loading : State196_50()
    data class Success(val data: String) : State196_50()
    data class Error(val message: String) : State196_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}