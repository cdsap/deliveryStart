package com.awesomeapp.commentsearch

sealed class State549_82 {
    data object Loading : State549_82()
    data class Success(val data: String) : State549_82()
    data class Error(val message: String) : State549_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}