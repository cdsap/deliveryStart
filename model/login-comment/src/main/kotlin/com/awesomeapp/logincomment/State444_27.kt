package com.awesomeapp.logincomment

sealed class State444_27 {
    data object Loading : State444_27()
    data class Success(val data: String) : State444_27()
    data class Error(val message: String) : State444_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}