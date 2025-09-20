package com.awesomeapp.sessionsync

sealed class State708_15 {
    data object Loading : State708_15()
    data class Success(val data: String) : State708_15()
    data class Error(val message: String) : State708_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}