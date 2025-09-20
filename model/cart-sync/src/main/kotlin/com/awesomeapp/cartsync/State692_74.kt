package com.awesomeapp.cartsync

sealed class State692_74 {
    data object Loading : State692_74()
    data class Success(val data: String) : State692_74()
    data class Error(val message: String) : State692_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}