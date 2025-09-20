package com.awesomeapp.cartfeed

sealed class State398_54 {
    data object Loading : State398_54()
    data class Success(val data: String) : State398_54()
    data class Error(val message: String) : State398_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}