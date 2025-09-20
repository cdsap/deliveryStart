package com.awesomeapp.analyticsfeed

sealed class State415_83 {
    data object Loading : State415_83()
    data class Success(val data: String) : State415_83()
    data class Error(val message: String) : State415_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}