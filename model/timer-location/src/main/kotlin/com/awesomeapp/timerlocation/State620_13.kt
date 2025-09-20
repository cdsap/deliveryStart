package com.awesomeapp.timerlocation

sealed class State620_13 {
    data object Loading : State620_13()
    data class Success(val data: String) : State620_13()
    data class Error(val message: String) : State620_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}