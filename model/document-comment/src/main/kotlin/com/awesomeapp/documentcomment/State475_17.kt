package com.awesomeapp.documentcomment

sealed class State475_17 {
    data object Loading : State475_17()
    data class Success(val data: String) : State475_17()
    data class Error(val message: String) : State475_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}