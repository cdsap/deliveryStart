package com.awesomeapp.accountcomment

sealed class State462_13 {
    data object Loading : State462_13()
    data class Success(val data: String) : State462_13()
    data class Error(val message: String) : State462_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}