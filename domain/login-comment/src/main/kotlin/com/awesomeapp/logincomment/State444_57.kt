package com.awesomeapp.logincomment

sealed class State444_57 {
    data object Loading : State444_57()
    data class Success(val data: String) : State444_57()
    data class Error(val message: String) : State444_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}