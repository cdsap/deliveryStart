package com.awesomeapp.grouppost

sealed class State507_106 {
    data object Loading : State507_106()
    data class Success(val data: String) : State507_106()
    data class Error(val message: String) : State507_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}