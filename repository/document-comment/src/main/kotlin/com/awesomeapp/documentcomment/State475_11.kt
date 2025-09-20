package com.awesomeapp.documentcomment

sealed class State475_11 {
    data object Loading : State475_11()
    data class Success(val data: String) : State475_11()
    data class Error(val message: String) : State475_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}