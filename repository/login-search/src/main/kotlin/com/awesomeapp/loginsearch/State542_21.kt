package com.awesomeapp.loginsearch

sealed class State542_21 {
    data object Loading : State542_21()
    data class Success(val data: String) : State542_21()
    data class Error(val message: String) : State542_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}