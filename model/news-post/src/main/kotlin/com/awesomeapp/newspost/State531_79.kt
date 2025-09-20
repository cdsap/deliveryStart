package com.awesomeapp.newspost

sealed class State531_79 {
    data object Loading : State531_79()
    data class Success(val data: String) : State531_79()
    data class Error(val message: String) : State531_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}