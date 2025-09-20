package com.awesomeapp.documentcomment

sealed class State475_23 {
    data object Loading : State475_23()
    data class Success(val data: String) : State475_23()
    data class Error(val message: String) : State475_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}