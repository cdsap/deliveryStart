package com.awesomeapp.articlesync

sealed class State728_53 {
    data object Loading : State728_53()
    data class Success(val data: String) : State728_53()
    data class Error(val message: String) : State728_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}