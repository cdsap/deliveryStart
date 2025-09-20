package com.awesomeapp.cartcontact

sealed class State55_98 {
    data object Loading : State55_98()
    data class Success(val data: String) : State55_98()
    data class Error(val message: String) : State55_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}