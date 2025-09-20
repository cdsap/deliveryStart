package com.awesomeapp.cartprofile

sealed class State349_57 {
    data object Loading : State349_57()
    data class Success(val data: String) : State349_57()
    data class Error(val message: String) : State349_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}