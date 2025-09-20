package com.awesomeapp.filelogin

sealed class State131_60 {
    data object Loading : State131_60()
    data class Success(val data: String) : State131_60()
    data class Error(val message: String) : State131_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}