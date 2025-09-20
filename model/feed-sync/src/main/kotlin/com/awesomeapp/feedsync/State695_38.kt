package com.awesomeapp.feedsync

sealed class State695_38 {
    data object Loading : State695_38()
    data class Success(val data: String) : State695_38()
    data class Error(val message: String) : State695_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}