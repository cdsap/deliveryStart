package com.awesomeapp.loginidentity

sealed class State150_27 {
    data object Loading : State150_27()
    data class Success(val data: String) : State150_27()
    data class Error(val message: String) : State150_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}