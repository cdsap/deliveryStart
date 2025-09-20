package com.awesomeapp.cartshare

sealed class State741_10 {
    data object Loading : State741_10()
    data class Success(val data: String) : State741_10()
    data class Error(val message: String) : State741_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}