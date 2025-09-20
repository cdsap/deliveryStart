package com.awesomeapp.feedsync

sealed class State695_137 {
    data object Loading : State695_137()
    data class Success(val data: String) : State695_137()
    data class Error(val message: String) : State695_137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}