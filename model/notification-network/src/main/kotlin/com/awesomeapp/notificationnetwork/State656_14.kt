package com.awesomeapp.notificationnetwork

sealed class State656_14 {
    data object Loading : State656_14()
    data class Success(val data: String) : State656_14()
    data class Error(val message: String) : State656_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}