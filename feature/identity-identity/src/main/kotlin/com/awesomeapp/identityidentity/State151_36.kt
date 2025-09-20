package com.awesomeapp.identityidentity

sealed class State151_36 {
    data object Loading : State151_36()
    data class Success(val data: String) : State151_36()
    data class Error(val message: String) : State151_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}