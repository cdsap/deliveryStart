package com.awesomeapp.playlistlocation

sealed class State637_99 {
    data object Loading : State637_99()
    data class Success(val data: String) : State637_99()
    data class Error(val message: String) : State637_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}