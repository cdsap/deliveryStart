package com.awesomeapp.cartprofile

sealed class State349_72 {
    data object Loading : State349_72()
    data class Success(val data: String) : State349_72()
    data class Error(val message: String) : State349_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}