package com.awesomeapp.postprofile

sealed class State354_82 {
    data object Loading : State354_82()
    data class Success(val data: String) : State354_82()
    data class Error(val message: String) : State354_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}