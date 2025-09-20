package com.awesomeapp.cartpost

sealed class State496_98 {
    data object Loading : State496_98()
    data class Success(val data: String) : State496_98()
    data class Error(val message: String) : State496_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}