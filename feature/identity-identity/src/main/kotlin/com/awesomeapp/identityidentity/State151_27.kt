package com.awesomeapp.identityidentity

sealed class State151_27 {
    data object Loading : State151_27()
    data class Success(val data: String) : State151_27()
    data class Error(val message: String) : State151_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}