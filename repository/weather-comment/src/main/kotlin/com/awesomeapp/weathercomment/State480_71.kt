package com.awesomeapp.weathercomment

sealed class State480_71 {
    data object Loading : State480_71()
    data class Success(val data: String) : State480_71()
    data class Error(val message: String) : State480_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}