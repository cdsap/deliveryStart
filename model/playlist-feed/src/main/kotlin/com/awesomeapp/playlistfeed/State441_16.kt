package com.awesomeapp.playlistfeed

sealed class State441_16 {
    data object Loading : State441_16()
    data class Success(val data: String) : State441_16()
    data class Error(val message: String) : State441_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}