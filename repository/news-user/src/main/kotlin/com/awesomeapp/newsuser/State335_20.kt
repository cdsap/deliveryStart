package com.awesomeapp.newsuser

sealed class State335_20 {
    data object Loading : State335_20()
    data class Success(val data: String) : State335_20()
    data class Error(val message: String) : State335_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}