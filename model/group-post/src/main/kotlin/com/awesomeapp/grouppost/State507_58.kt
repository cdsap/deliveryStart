package com.awesomeapp.grouppost

sealed class State507_58 {
    data object Loading : State507_58()
    data class Success(val data: String) : State507_58()
    data class Error(val message: String) : State507_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}