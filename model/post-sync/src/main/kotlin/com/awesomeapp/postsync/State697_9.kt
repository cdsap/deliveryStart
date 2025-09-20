package com.awesomeapp.postsync

sealed class State697_9 {
    data object Loading : State697_9()
    data class Success(val data: String) : State697_9()
    data class Error(val message: String) : State697_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}