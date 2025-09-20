package com.awesomeapp.notificationnetwork

sealed class State656_26 {
    data object Loading : State656_26()
    data class Success(val data: String) : State656_26()
    data class Error(val message: String) : State656_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}