package com.awesomeapp.podcastpost

sealed class State533_72 {
    data object Loading : State533_72()
    data class Success(val data: String) : State533_72()
    data class Error(val message: String) : State533_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}