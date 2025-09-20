package com.awesomeapp.newsuser

sealed class State335_17 {
    data object Loading : State335_17()
    data class Success(val data: String) : State335_17()
    data class Error(val message: String) : State335_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}