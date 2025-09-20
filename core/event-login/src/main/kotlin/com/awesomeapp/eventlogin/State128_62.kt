package com.awesomeapp.eventlogin

sealed class State128_62 {
    data object Loading : State128_62()
    data class Success(val data: String) : State128_62()
    data class Error(val message: String) : State128_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}