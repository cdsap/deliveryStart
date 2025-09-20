package com.awesomeapp.commentsearch

sealed class State549_79 {
    data object Loading : State549_79()
    data class Success(val data: String) : State549_79()
    data class Error(val message: String) : State549_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}