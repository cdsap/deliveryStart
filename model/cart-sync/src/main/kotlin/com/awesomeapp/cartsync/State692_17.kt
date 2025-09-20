package com.awesomeapp.cartsync

sealed class State692_17 {
    data object Loading : State692_17()
    data class Success(val data: String) : State692_17()
    data class Error(val message: String) : State692_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}