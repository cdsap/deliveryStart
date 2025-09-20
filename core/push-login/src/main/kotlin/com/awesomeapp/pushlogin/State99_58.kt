package com.awesomeapp.pushlogin

sealed class State99_58 {
    data object Loading : State99_58()
    data class Success(val data: String) : State99_58()
    data class Error(val message: String) : State99_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}