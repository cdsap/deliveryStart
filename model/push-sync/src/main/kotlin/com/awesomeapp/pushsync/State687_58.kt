package com.awesomeapp.pushsync

sealed class State687_58 {
    data object Loading : State687_58()
    data class Success(val data: String) : State687_58()
    data class Error(val message: String) : State687_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}