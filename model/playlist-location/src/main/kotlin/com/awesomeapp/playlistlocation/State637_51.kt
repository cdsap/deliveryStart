package com.awesomeapp.playlistlocation

sealed class State637_51 {
    data object Loading : State637_51()
    data class Success(val data: String) : State637_51()
    data class Error(val message: String) : State637_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}