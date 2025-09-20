package com.awesomeapp.cartprofile

sealed class State349_45 {
    data object Loading : State349_45()
    data class Success(val data: String) : State349_45()
    data class Error(val message: String) : State349_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}