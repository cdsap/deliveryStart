package com.awesomeapp.podcastnetwork

sealed class State680_16 {
    data object Loading : State680_16()
    data class Success(val data: String) : State680_16()
    data class Error(val message: String) : State680_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}