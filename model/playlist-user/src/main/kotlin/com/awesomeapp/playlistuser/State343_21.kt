package com.awesomeapp.playlistuser

sealed class State343_21 {
    data object Loading : State343_21()
    data class Success(val data: String) : State343_21()
    data class Error(val message: String) : State343_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}