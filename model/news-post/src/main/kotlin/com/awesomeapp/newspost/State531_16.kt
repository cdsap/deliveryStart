package com.awesomeapp.newspost

sealed class State531_16 {
    data object Loading : State531_16()
    data class Success(val data: String) : State531_16()
    data class Error(val message: String) : State531_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}