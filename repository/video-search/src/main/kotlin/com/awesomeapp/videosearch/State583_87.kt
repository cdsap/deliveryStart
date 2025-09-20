package com.awesomeapp.videosearch

sealed class State583_87 {
    data object Loading : State583_87()
    data class Success(val data: String) : State583_87()
    data class Error(val message: String) : State583_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}