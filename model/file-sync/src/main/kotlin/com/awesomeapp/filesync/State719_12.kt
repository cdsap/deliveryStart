package com.awesomeapp.filesync

sealed class State719_12 {
    data object Loading : State719_12()
    data class Success(val data: String) : State719_12()
    data class Error(val message: String) : State719_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}