package com.awesomeapp.postsync

sealed class State697_27 {
    data object Loading : State697_27()
    data class Success(val data: String) : State697_27()
    data class Error(val message: String) : State697_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}