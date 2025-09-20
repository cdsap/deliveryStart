package com.awesomeapp.cartshare

sealed class State741_6 {
    data object Loading : State741_6()
    data class Success(val data: String) : State741_6()
    data class Error(val message: String) : State741_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}