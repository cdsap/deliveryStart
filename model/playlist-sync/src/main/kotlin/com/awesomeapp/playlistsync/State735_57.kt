package com.awesomeapp.playlistsync

sealed class State735_57 {
    data object Loading : State735_57()
    data class Success(val data: String) : State735_57()
    data class Error(val message: String) : State735_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}