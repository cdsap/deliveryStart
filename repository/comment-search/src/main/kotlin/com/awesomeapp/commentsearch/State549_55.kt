package com.awesomeapp.commentsearch

sealed class State549_55 {
    data object Loading : State549_55()
    data class Success(val data: String) : State549_55()
    data class Error(val message: String) : State549_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}