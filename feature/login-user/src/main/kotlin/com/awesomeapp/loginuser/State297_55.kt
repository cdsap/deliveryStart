package com.awesomeapp.loginuser

sealed class State297_55 {
    data object Loading : State297_55()
    data class Success(val data: String) : State297_55()
    data class Error(val message: String) : State297_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}