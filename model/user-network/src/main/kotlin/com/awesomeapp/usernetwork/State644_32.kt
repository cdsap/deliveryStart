package com.awesomeapp.usernetwork

sealed class State644_32 {
    data object Loading : State644_32()
    data class Success(val data: String) : State644_32()
    data class Error(val message: String) : State644_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}