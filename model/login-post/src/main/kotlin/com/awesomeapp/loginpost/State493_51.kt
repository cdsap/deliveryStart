package com.awesomeapp.loginpost

sealed class State493_51 {
    data object Loading : State493_51()
    data class Success(val data: String) : State493_51()
    data class Error(val message: String) : State493_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}