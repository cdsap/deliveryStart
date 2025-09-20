package com.awesomeapp.playlistuser

sealed class State343_9 {
    data object Loading : State343_9()
    data class Success(val data: String) : State343_9()
    data class Error(val message: String) : State343_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}