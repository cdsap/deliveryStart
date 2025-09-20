package com.awesomeapp.postsearch

sealed class State550_59 {
    data object Loading : State550_59()
    data class Success(val data: String) : State550_59()
    data class Error(val message: String) : State550_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}