package com.awesomeapp.playlistlogin

sealed class State147_94 {
    data object Loading : State147_94()
    data class Success(val data: String) : State147_94()
    data class Error(val message: String) : State147_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}