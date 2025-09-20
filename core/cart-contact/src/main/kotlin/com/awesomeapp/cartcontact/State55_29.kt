package com.awesomeapp.cartcontact

sealed class State55_29 {
    data object Loading : State55_29()
    data class Success(val data: String) : State55_29()
    data class Error(val message: String) : State55_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}