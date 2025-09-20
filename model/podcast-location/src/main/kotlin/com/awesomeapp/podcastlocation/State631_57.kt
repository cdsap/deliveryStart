package com.awesomeapp.podcastlocation

sealed class State631_57 {
    data object Loading : State631_57()
    data class Success(val data: String) : State631_57()
    data class Error(val message: String) : State631_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}