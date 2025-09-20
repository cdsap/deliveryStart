package com.awesomeapp.videosearch

sealed class State583_45 {
    data object Loading : State583_45()
    data class Success(val data: String) : State583_45()
    data class Error(val message: String) : State583_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}