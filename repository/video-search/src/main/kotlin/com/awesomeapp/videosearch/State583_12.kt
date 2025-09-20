package com.awesomeapp.videosearch

sealed class State583_12 {
    data object Loading : State583_12()
    data class Success(val data: String) : State583_12()
    data class Error(val message: String) : State583_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}