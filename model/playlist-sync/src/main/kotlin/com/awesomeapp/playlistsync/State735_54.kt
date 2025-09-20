package com.awesomeapp.playlistsync

sealed class State735_54 {
    data object Loading : State735_54()
    data class Success(val data: String) : State735_54()
    data class Error(val message: String) : State735_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}