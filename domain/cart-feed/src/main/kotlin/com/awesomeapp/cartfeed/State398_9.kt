package com.awesomeapp.cartfeed

sealed class State398_9 {
    data object Loading : State398_9()
    data class Success(val data: String) : State398_9()
    data class Error(val message: String) : State398_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}