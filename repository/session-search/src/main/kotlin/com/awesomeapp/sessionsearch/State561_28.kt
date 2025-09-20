package com.awesomeapp.sessionsearch

sealed class State561_28 {
    data object Loading : State561_28()
    data class Success(val data: String) : State561_28()
    data class Error(val message: String) : State561_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}