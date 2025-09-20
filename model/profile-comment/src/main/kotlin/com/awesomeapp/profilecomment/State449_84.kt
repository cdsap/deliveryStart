package com.awesomeapp.profilecomment

sealed class State449_84 {
    data object Loading : State449_84()
    data class Success(val data: String) : State449_84()
    data class Error(val message: String) : State449_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}