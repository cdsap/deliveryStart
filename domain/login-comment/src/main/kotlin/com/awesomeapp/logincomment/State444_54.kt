package com.awesomeapp.logincomment

sealed class State444_54 {
    data object Loading : State444_54()
    data class Success(val data: String) : State444_54()
    data class Error(val message: String) : State444_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}