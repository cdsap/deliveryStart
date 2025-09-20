package com.awesomeapp.feedsync

sealed class State695_122 {
    data object Loading : State695_122()
    data class Success(val data: String) : State695_122()
    data class Error(val message: String) : State695_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}