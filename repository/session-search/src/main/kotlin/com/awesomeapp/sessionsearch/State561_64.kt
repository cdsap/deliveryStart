package com.awesomeapp.sessionsearch

sealed class State561_64 {
    data object Loading : State561_64()
    data class Success(val data: String) : State561_64()
    data class Error(val message: String) : State561_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}