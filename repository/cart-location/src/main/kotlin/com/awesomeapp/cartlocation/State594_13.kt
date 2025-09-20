package com.awesomeapp.cartlocation

sealed class State594_13 {
    data object Loading : State594_13()
    data class Success(val data: String) : State594_13()
    data class Error(val message: String) : State594_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}