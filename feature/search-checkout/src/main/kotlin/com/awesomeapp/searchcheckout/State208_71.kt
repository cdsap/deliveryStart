package com.awesomeapp.searchcheckout

sealed class State208_71 {
    data object Loading : State208_71()
    data class Success(val data: String) : State208_71()
    data class Error(val message: String) : State208_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}