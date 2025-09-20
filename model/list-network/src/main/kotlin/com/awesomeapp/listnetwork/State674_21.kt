package com.awesomeapp.listnetwork

sealed class State674_21 {
    data object Loading : State674_21()
    data class Success(val data: String) : State674_21()
    data class Error(val message: String) : State674_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}