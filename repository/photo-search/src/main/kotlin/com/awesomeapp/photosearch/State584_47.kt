package com.awesomeapp.photosearch

sealed class State584_47 {
    data object Loading : State584_47()
    data class Success(val data: String) : State584_47()
    data class Error(val message: String) : State584_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}