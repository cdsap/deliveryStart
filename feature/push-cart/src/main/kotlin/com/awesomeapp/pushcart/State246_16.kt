package com.awesomeapp.pushcart

sealed class State246_16 {
    data object Loading : State246_16()
    data class Success(val data: String) : State246_16()
    data class Error(val message: String) : State246_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}