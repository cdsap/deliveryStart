package com.awesomeapp.articlesync

sealed class State728_20 {
    data object Loading : State728_20()
    data class Success(val data: String) : State728_20()
    data class Error(val message: String) : State728_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}