package com.awesomeapp.postsearch

sealed class State550_23 {
    data object Loading : State550_23()
    data class Success(val data: String) : State550_23()
    data class Error(val message: String) : State550_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}