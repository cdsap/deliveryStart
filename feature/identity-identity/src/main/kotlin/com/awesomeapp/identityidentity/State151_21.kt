package com.awesomeapp.identityidentity

sealed class State151_21 {
    data object Loading : State151_21()
    data class Success(val data: String) : State151_21()
    data class Error(val message: String) : State151_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}