package com.awesomeapp.sharepost

sealed class State506_36 {
    data object Loading : State506_36()
    data class Success(val data: String) : State506_36()
    data class Error(val message: String) : State506_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}