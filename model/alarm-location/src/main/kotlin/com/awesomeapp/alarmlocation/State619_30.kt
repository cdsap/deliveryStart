package com.awesomeapp.alarmlocation

sealed class State619_30 {
    data object Loading : State619_30()
    data class Success(val data: String) : State619_30()
    data class Error(val message: String) : State619_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}