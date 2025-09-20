package com.awesomeapp.videosearch

sealed class State583_102 {
    data object Loading : State583_102()
    data class Success(val data: String) : State583_102()
    data class Error(val message: String) : State583_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}