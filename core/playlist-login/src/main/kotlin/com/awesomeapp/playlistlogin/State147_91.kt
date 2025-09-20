package com.awesomeapp.playlistlogin

sealed class State147_91 {
    data object Loading : State147_91()
    data class Success(val data: String) : State147_91()
    data class Error(val message: String) : State147_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}