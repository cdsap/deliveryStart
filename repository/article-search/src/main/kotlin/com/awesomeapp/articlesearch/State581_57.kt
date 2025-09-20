package com.awesomeapp.articlesearch

sealed class State581_57 {
    data object Loading : State581_57()
    data class Success(val data: String) : State581_57()
    data class Error(val message: String) : State581_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}