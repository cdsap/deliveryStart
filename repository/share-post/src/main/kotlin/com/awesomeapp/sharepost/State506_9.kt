package com.awesomeapp.sharepost

sealed class State506_9 {
    data object Loading : State506_9()
    data class Success(val data: String) : State506_9()
    data class Error(val message: String) : State506_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}