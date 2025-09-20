package com.awesomeapp.groupidentity

sealed class State164_62 {
    data object Loading : State164_62()
    data class Success(val data: String) : State164_62()
    data class Error(val message: String) : State164_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}