package com.awesomeapp.post

sealed class State11_12 {
    data object Loading : State11_12()
    data class Success(val data: String) : State11_12()
    data class Error(val message: String) : State11_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}