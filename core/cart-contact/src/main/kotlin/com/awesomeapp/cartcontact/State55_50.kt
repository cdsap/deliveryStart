package com.awesomeapp.cartcontact

sealed class State55_50 {
    data object Loading : State55_50()
    data class Success(val data: String) : State55_50()
    data class Error(val message: String) : State55_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}