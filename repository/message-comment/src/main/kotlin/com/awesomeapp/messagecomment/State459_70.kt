package com.awesomeapp.messagecomment

sealed class State459_70 {
    data object Loading : State459_70()
    data class Success(val data: String) : State459_70()
    data class Error(val message: String) : State459_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}