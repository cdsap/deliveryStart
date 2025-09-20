package com.awesomeapp.accountcomment

sealed class State462_16 {
    data object Loading : State462_16()
    data class Success(val data: String) : State462_16()
    data class Error(val message: String) : State462_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}