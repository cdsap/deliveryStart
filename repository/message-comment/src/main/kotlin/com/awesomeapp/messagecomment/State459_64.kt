package com.awesomeapp.messagecomment

sealed class State459_64 {
    data object Loading : State459_64()
    data class Success(val data: String) : State459_64()
    data class Error(val message: String) : State459_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}