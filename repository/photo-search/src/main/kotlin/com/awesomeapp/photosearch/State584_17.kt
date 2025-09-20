package com.awesomeapp.photosearch

sealed class State584_17 {
    data object Loading : State584_17()
    data class Success(val data: String) : State584_17()
    data class Error(val message: String) : State584_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}