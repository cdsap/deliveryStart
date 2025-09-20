package com.awesomeapp.playlistsearch

sealed class State588_51 {
    data object Loading : State588_51()
    data class Success(val data: String) : State588_51()
    data class Error(val message: String) : State588_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}