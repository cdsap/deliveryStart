package com.awesomeapp.cartuser

sealed class State300_32 {
    data object Loading : State300_32()
    data class Success(val data: String) : State300_32()
    data class Error(val message: String) : State300_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}