package com.awesomeapp.reportsearch

sealed class State563_123 {
    data object Loading : State563_123()
    data class Success(val data: String) : State563_123()
    data class Error(val message: String) : State563_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}