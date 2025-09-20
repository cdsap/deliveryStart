package com.awesomeapp.postcart

sealed class State256_20 {
    data object Loading : State256_20()
    data class Success(val data: String) : State256_20()
    data class Error(val message: String) : State256_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}