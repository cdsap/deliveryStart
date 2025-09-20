package com.awesomeapp.playlistlogin

sealed class State147_22 {
    data object Loading : State147_22()
    data class Success(val data: String) : State147_22()
    data class Error(val message: String) : State147_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}