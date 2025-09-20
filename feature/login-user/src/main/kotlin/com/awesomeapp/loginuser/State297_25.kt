package com.awesomeapp.loginuser

sealed class State297_25 {
    data object Loading : State297_25()
    data class Success(val data: String) : State297_25()
    data class Error(val message: String) : State297_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}