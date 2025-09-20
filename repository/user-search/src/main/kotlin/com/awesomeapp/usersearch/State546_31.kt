package com.awesomeapp.usersearch

sealed class State546_31 {
    data object Loading : State546_31()
    data class Success(val data: String) : State546_31()
    data class Error(val message: String) : State546_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}