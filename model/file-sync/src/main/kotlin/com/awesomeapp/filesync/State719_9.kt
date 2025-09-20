package com.awesomeapp.filesync

sealed class State719_9 {
    data object Loading : State719_9()
    data class Success(val data: String) : State719_9()
    data class Error(val message: String) : State719_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}