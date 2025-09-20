package com.awesomeapp.cartfeed

sealed class State398_51 {
    data object Loading : State398_51()
    data class Success(val data: String) : State398_51()
    data class Error(val message: String) : State398_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}