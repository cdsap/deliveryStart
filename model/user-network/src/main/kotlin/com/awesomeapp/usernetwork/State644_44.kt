package com.awesomeapp.usernetwork

sealed class State644_44 {
    data object Loading : State644_44()
    data class Success(val data: String) : State644_44()
    data class Error(val message: String) : State644_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}