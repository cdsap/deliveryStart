package com.awesomeapp.podcastpost

sealed class State533_57 {
    data object Loading : State533_57()
    data class Success(val data: String) : State533_57()
    data class Error(val message: String) : State533_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}