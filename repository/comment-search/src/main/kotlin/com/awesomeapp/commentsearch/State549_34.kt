package com.awesomeapp.commentsearch

sealed class State549_34 {
    data object Loading : State549_34()
    data class Success(val data: String) : State549_34()
    data class Error(val message: String) : State549_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}