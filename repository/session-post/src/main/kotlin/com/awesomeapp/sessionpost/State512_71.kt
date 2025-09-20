package com.awesomeapp.sessionpost

sealed class State512_71 {
    data object Loading : State512_71()
    data class Success(val data: String) : State512_71()
    data class Error(val message: String) : State512_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}