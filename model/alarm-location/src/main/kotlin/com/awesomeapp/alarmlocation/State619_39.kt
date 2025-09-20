package com.awesomeapp.alarmlocation

sealed class State619_39 {
    data object Loading : State619_39()
    data class Success(val data: String) : State619_39()
    data class Error(val message: String) : State619_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}