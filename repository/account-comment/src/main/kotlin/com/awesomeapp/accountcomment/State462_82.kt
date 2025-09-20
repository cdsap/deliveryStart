package com.awesomeapp.accountcomment

sealed class State462_82 {
    data object Loading : State462_82()
    data class Success(val data: String) : State462_82()
    data class Error(val message: String) : State462_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}