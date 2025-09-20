package com.awesomeapp.newsfeed

sealed class State433_33 {
    data object Loading : State433_33()
    data class Success(val data: String) : State433_33()
    data class Error(val message: String) : State433_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}