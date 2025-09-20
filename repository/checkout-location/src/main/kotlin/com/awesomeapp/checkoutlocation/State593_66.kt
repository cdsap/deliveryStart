package com.awesomeapp.checkoutlocation

sealed class State593_66 {
    data object Loading : State593_66()
    data class Success(val data: String) : State593_66()
    data class Error(val message: String) : State593_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}