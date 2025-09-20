package com.awesomeapp.postfeed

sealed class State403_9 {
    data object Loading : State403_9()
    data class Success(val data: String) : State403_9()
    data class Error(val message: String) : State403_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}