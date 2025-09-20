package com.awesomeapp.playlistfeed

sealed class State441_103 {
    data object Loading : State441_103()
    data class Success(val data: String) : State441_103()
    data class Error(val message: String) : State441_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}