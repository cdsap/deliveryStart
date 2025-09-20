package com.awesomeapp.cartidentity

sealed class State153_58 {
    data object Loading : State153_58()
    data class Success(val data: String) : State153_58()
    data class Error(val message: String) : State153_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}