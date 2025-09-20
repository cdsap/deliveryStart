package com.awesomeapp.podcastidentity

sealed class State190_35 {
    data object Loading : State190_35()
    data class Success(val data: String) : State190_35()
    data class Error(val message: String) : State190_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}