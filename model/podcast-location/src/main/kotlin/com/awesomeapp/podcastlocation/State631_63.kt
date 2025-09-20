package com.awesomeapp.podcastlocation

sealed class State631_63 {
    data object Loading : State631_63()
    data class Success(val data: String) : State631_63()
    data class Error(val message: String) : State631_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}