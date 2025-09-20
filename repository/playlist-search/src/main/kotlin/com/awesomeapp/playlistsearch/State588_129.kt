package com.awesomeapp.playlistsearch

sealed class State588_129 {
    data object Loading : State588_129()
    data class Success(val data: String) : State588_129()
    data class Error(val message: String) : State588_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}