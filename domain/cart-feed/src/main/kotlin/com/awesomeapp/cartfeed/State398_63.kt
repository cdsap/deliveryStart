package com.awesomeapp.cartfeed

sealed class State398_63 {
    data object Loading : State398_63()
    data class Success(val data: String) : State398_63()
    data class Error(val message: String) : State398_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}