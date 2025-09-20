package com.awesomeapp.feedsync

sealed class State695_35 {
    data object Loading : State695_35()
    data class Success(val data: String) : State695_35()
    data class Error(val message: String) : State695_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}