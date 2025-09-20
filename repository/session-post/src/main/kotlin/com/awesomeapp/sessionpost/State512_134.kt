package com.awesomeapp.sessionpost

sealed class State512_134 {
    data object Loading : State512_134()
    data class Success(val data: String) : State512_134()
    data class Error(val message: String) : State512_134()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}