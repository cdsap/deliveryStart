package com.awesomeapp.audiolocation

sealed class State636_87 {
    data object Loading : State636_87()
    data class Success(val data: String) : State636_87()
    data class Error(val message: String) : State636_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}