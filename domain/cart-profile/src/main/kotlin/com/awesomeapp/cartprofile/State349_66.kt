package com.awesomeapp.cartprofile

sealed class State349_66 {
    data object Loading : State349_66()
    data class Success(val data: String) : State349_66()
    data class Error(val message: String) : State349_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}