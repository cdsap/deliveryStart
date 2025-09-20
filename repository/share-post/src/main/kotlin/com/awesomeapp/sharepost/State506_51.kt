package com.awesomeapp.sharepost

sealed class State506_51 {
    data object Loading : State506_51()
    data class Success(val data: String) : State506_51()
    data class Error(val message: String) : State506_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}