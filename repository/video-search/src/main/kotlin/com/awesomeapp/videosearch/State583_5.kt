package com.awesomeapp.videosearch

sealed class State583_5 {
    data object Loading : State583_5()
    data class Success(val data: String) : State583_5()
    data class Error(val message: String) : State583_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}