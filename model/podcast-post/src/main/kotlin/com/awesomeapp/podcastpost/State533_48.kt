package com.awesomeapp.podcastpost

sealed class State533_48 {
    data object Loading : State533_48()
    data class Success(val data: String) : State533_48()
    data class Error(val message: String) : State533_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}