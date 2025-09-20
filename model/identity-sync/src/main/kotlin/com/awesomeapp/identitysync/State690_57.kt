package com.awesomeapp.identitysync

sealed class State690_57 {
    data object Loading : State690_57()
    data class Success(val data: String) : State690_57()
    data class Error(val message: String) : State690_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}