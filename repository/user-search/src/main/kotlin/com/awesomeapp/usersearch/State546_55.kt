package com.awesomeapp.usersearch

sealed class State546_55 {
    data object Loading : State546_55()
    data class Success(val data: String) : State546_55()
    data class Error(val message: String) : State546_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}