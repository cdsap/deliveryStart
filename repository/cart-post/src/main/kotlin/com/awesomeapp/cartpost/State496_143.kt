package com.awesomeapp.cartpost

sealed class State496_143 {
    data object Loading : State496_143()
    data class Success(val data: String) : State496_143()
    data class Error(val message: String) : State496_143()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}