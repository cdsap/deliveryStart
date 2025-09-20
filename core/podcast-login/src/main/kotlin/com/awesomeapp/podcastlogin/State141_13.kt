package com.awesomeapp.podcastlogin

sealed class State141_13 {
    data object Loading : State141_13()
    data class Success(val data: String) : State141_13()
    data class Error(val message: String) : State141_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}