package com.awesomeapp.checkoutlocation

sealed class State593_51 {
    data object Loading : State593_51()
    data class Success(val data: String) : State593_51()
    data class Error(val message: String) : State593_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}