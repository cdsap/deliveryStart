package com.awesomeapp.playlistpost

sealed class State539_114 {
    data object Loading : State539_114()
    data class Success(val data: String) : State539_114()
    data class Error(val message: String) : State539_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}