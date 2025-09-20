package com.awesomeapp.filelogin

sealed class State131_78 {
    data object Loading : State131_78()
    data class Success(val data: String) : State131_78()
    data class Error(val message: String) : State131_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}