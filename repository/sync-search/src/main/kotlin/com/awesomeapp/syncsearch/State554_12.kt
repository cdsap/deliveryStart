package com.awesomeapp.syncsearch

sealed class State554_12 {
    data object Loading : State554_12()
    data class Success(val data: String) : State554_12()
    data class Error(val message: String) : State554_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}