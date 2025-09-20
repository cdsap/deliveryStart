package com.awesomeapp.sessionpost

sealed class State512_110 {
    data object Loading : State512_110()
    data class Success(val data: String) : State512_110()
    data class Error(val message: String) : State512_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}