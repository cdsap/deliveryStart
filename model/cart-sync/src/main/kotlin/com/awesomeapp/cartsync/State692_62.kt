package com.awesomeapp.cartsync

sealed class State692_62 {
    data object Loading : State692_62()
    data class Success(val data: String) : State692_62()
    data class Error(val message: String) : State692_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}