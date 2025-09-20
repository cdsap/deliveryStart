package com.awesomeapp.sessionsearch

sealed class State561_40 {
    data object Loading : State561_40()
    data class Success(val data: String) : State561_40()
    data class Error(val message: String) : State561_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}