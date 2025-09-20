package com.awesomeapp.accountuser

sealed class State315_18 {
    data object Loading : State315_18()
    data class Success(val data: String) : State315_18()
    data class Error(val message: String) : State315_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}