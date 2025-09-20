package com.awesomeapp.newsfeed

sealed class State433_66 {
    data object Loading : State433_66()
    data class Success(val data: String) : State433_66()
    data class Error(val message: String) : State433_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}