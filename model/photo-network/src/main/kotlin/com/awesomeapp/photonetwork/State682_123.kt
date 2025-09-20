package com.awesomeapp.photonetwork

sealed class State682_123 {
    data object Loading : State682_123()
    data class Success(val data: String) : State682_123()
    data class Error(val message: String) : State682_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}