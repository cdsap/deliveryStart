package com.awesomeapp.cartidentity

sealed class State153_34 {
    data object Loading : State153_34()
    data class Success(val data: String) : State153_34()
    data class Error(val message: String) : State153_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}