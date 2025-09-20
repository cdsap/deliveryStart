package com.awesomeapp.postsync

sealed class State697_93 {
    data object Loading : State697_93()
    data class Success(val data: String) : State697_93()
    data class Error(val message: String) : State697_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}