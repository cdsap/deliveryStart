package com.awesomeapp.podcastidentity

sealed class State190_122 {
    data object Loading : State190_122()
    data class Success(val data: String) : State190_122()
    data class Error(val message: String) : State190_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}