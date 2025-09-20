package com.awesomeapp.playlistpost

sealed class State539_48 {
    data object Loading : State539_48()
    data class Success(val data: String) : State539_48()
    data class Error(val message: String) : State539_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}