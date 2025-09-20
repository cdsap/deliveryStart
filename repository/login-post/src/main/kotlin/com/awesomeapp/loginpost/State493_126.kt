package com.awesomeapp.loginpost

sealed class State493_126 {
    data object Loading : State493_126()
    data class Success(val data: String) : State493_126()
    data class Error(val message: String) : State493_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}