package com.awesomeapp.playlistcontact

sealed class State98_21 {
    data object Loading : State98_21()
    data class Success(val data: String) : State98_21()
    data class Error(val message: String) : State98_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}