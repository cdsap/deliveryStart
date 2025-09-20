package com.awesomeapp.playlistfeed

sealed class State441_6 {
    data object Loading : State441_6()
    data class Success(val data: String) : State441_6()
    data class Error(val message: String) : State441_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}