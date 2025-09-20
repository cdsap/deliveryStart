package com.awesomeapp.cartidentity

sealed class State153_16 {
    data object Loading : State153_16()
    data class Success(val data: String) : State153_16()
    data class Error(val message: String) : State153_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}