package com.awesomeapp.identityidentity

sealed class State151_57 {
    data object Loading : State151_57()
    data class Success(val data: String) : State151_57()
    data class Error(val message: String) : State151_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}