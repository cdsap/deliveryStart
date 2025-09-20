package com.awesomeapp.network

sealed class State14_108 {
    data object Loading : State14_108()
    data class Success(val data: String) : State14_108()
    data class Error(val message: String) : State14_108()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}