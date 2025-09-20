package com.awesomeapp.syncsearch

sealed class State554_21 {
    data object Loading : State554_21()
    data class Success(val data: String) : State554_21()
    data class Error(val message: String) : State554_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}