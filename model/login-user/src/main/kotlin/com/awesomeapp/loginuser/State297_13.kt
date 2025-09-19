package com.awesomeapp.loginuser

sealed class State297_13 {
    data object Loading : State297_13()
    data class Success(val data: String) : State297_13()
    data class Error(val message: String) : State297_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}