package com.awesomeapp.notecomment

sealed class State476_71 {
    data object Loading : State476_71()
    data class Success(val data: String) : State476_71()
    data class Error(val message: String) : State476_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}