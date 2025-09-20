package com.awesomeapp.articlesearch

sealed class State581_21 {
    data object Loading : State581_21()
    data class Success(val data: String) : State581_21()
    data class Error(val message: String) : State581_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}