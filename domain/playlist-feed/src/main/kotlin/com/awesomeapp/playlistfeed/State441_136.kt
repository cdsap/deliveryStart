package com.awesomeapp.playlistfeed

sealed class State441_136 {
    data object Loading : State441_136()
    data class Success(val data: String) : State441_136()
    data class Error(val message: String) : State441_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}