package com.awesomeapp.usersync

sealed class State693_82 {
    data object Loading : State693_82()
    data class Success(val data: String) : State693_82()
    data class Error(val message: String) : State693_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}