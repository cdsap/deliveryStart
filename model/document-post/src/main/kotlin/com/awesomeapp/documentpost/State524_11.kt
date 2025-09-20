package com.awesomeapp.documentpost

sealed class State524_11 {
    data object Loading : State524_11()
    data class Success(val data: String) : State524_11()
    data class Error(val message: String) : State524_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}