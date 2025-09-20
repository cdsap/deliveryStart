package com.awesomeapp.cartpost

sealed class State496_80 {
    data object Loading : State496_80()
    data class Success(val data: String) : State496_80()
    data class Error(val message: String) : State496_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}