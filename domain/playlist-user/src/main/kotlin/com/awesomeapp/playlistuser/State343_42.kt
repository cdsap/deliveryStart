package com.awesomeapp.playlistuser

sealed class State343_42 {
    data object Loading : State343_42()
    data class Success(val data: String) : State343_42()
    data class Error(val message: String) : State343_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}