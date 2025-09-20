package com.awesomeapp.podcastlocation

sealed class State631_36 {
    data object Loading : State631_36()
    data class Success(val data: String) : State631_36()
    data class Error(val message: String) : State631_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}