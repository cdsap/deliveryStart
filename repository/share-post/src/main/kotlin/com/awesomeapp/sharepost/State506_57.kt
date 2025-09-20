package com.awesomeapp.sharepost

sealed class State506_57 {
    data object Loading : State506_57()
    data class Success(val data: String) : State506_57()
    data class Error(val message: String) : State506_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}