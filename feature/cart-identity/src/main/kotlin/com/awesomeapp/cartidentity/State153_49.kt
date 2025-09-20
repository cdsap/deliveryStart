package com.awesomeapp.cartidentity

sealed class State153_49 {
    data object Loading : State153_49()
    data class Success(val data: String) : State153_49()
    data class Error(val message: String) : State153_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}