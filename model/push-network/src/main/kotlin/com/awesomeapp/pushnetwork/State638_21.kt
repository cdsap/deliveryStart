package com.awesomeapp.pushnetwork

sealed class State638_21 {
    data object Loading : State638_21()
    data class Success(val data: String) : State638_21()
    data class Error(val message: String) : State638_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}