package com.awesomeapp.network

sealed class State14_51 {
    data object Loading : State14_51()
    data class Success(val data: String) : State14_51()
    data class Error(val message: String) : State14_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}