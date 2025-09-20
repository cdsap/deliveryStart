package com.awesomeapp.photosearch

sealed class State584_50 {
    data object Loading : State584_50()
    data class Success(val data: String) : State584_50()
    data class Error(val message: String) : State584_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}