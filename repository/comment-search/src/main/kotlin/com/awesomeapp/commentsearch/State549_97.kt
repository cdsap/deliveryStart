package com.awesomeapp.commentsearch

sealed class State549_97 {
    data object Loading : State549_97()
    data class Success(val data: String) : State549_97()
    data class Error(val message: String) : State549_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}