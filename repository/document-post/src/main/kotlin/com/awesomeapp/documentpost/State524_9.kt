package com.awesomeapp.documentpost

sealed class State524_9 {
    data object Loading : State524_9()
    data class Success(val data: String) : State524_9()
    data class Error(val message: String) : State524_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}