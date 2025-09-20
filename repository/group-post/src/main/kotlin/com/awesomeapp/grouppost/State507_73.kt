package com.awesomeapp.grouppost

sealed class State507_73 {
    data object Loading : State507_73()
    data class Success(val data: String) : State507_73()
    data class Error(val message: String) : State507_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}