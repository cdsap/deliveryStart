package com.awesomeapp.newspost

sealed class State531_97 {
    data object Loading : State531_97()
    data class Success(val data: String) : State531_97()
    data class Error(val message: String) : State531_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}