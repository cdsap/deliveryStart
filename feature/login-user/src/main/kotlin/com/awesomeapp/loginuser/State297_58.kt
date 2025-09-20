package com.awesomeapp.loginuser

sealed class State297_58 {
    data object Loading : State297_58()
    data class Success(val data: String) : State297_58()
    data class Error(val message: String) : State297_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}