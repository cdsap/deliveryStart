package com.awesomeapp.identityuser

sealed class State298_12 {
    data object Loading : State298_12()
    data class Success(val data: String) : State298_12()
    data class Error(val message: String) : State298_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}