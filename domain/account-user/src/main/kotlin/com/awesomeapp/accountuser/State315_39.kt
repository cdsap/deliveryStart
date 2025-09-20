package com.awesomeapp.accountuser

sealed class State315_39 {
    data object Loading : State315_39()
    data class Success(val data: String) : State315_39()
    data class Error(val message: String) : State315_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}