package com.awesomeapp.filelogin

sealed class State131_72 {
    data object Loading : State131_72()
    data class Success(val data: String) : State131_72()
    data class Error(val message: String) : State131_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}