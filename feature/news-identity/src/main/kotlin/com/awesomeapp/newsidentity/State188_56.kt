package com.awesomeapp.newsidentity

sealed class State188_56 {
    data object Loading : State188_56()
    data class Success(val data: String) : State188_56()
    data class Error(val message: String) : State188_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}