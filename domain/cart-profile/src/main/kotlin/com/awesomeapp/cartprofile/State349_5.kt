package com.awesomeapp.cartprofile

sealed class State349_5 {
    data object Loading : State349_5()
    data class Success(val data: String) : State349_5()
    data class Error(val message: String) : State349_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}