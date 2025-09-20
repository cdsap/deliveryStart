package com.awesomeapp.podcastlogin

sealed class State141_22 {
    data object Loading : State141_22()
    data class Success(val data: String) : State141_22()
    data class Error(val message: String) : State141_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}