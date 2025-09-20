package com.awesomeapp.cartcontact

sealed class State55_110 {
    data object Loading : State55_110()
    data class Success(val data: String) : State55_110()
    data class Error(val message: String) : State55_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}