package com.awesomeapp.postidentity

sealed class State158_57 {
    data object Loading : State158_57()
    data class Success(val data: String) : State158_57()
    data class Error(val message: String) : State158_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}