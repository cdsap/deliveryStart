package com.awesomeapp.playlistcart

sealed class State294_13 {
    data object Loading : State294_13()
    data class Success(val data: String) : State294_13()
    data class Error(val message: String) : State294_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}