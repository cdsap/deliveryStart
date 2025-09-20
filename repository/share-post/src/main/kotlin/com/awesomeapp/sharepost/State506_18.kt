package com.awesomeapp.sharepost

sealed class State506_18 {
    data object Loading : State506_18()
    data class Success(val data: String) : State506_18()
    data class Error(val message: String) : State506_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}