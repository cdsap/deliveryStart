package com.awesomeapp.articlesearch

sealed class State581_75 {
    data object Loading : State581_75()
    data class Success(val data: String) : State581_75()
    data class Error(val message: String) : State581_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}