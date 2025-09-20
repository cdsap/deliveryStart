package com.awesomeapp.newssync

sealed class State727_9 {
    data object Loading : State727_9()
    data class Success(val data: String) : State727_9()
    data class Error(val message: String) : State727_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}