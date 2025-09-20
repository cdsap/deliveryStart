package com.awesomeapp.postsearch

sealed class State550_11 {
    data object Loading : State550_11()
    data class Success(val data: String) : State550_11()
    data class Error(val message: String) : State550_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}