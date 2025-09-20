package com.awesomeapp.alarmlocation

sealed class State619_57 {
    data object Loading : State619_57()
    data class Success(val data: String) : State619_57()
    data class Error(val message: String) : State619_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}