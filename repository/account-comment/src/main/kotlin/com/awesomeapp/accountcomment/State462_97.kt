package com.awesomeapp.accountcomment

sealed class State462_97 {
    data object Loading : State462_97()
    data class Success(val data: String) : State462_97()
    data class Error(val message: String) : State462_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}