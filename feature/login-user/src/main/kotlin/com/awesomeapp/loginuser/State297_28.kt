package com.awesomeapp.loginuser

sealed class State297_28 {
    data object Loading : State297_28()
    data class Success(val data: String) : State297_28()
    data class Error(val message: String) : State297_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}