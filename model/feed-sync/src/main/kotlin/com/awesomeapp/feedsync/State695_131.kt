package com.awesomeapp.feedsync

sealed class State695_131 {
    data object Loading : State695_131()
    data class Success(val data: String) : State695_131()
    data class Error(val message: String) : State695_131()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}