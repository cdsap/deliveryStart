package com.awesomeapp.podcastnetwork

sealed class State680_19 {
    data object Loading : State680_19()
    data class Success(val data: String) : State680_19()
    data class Error(val message: String) : State680_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}