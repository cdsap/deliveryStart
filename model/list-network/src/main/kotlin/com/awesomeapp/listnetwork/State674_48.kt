package com.awesomeapp.listnetwork

sealed class State674_48 {
    data object Loading : State674_48()
    data class Success(val data: String) : State674_48()
    data class Error(val message: String) : State674_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}