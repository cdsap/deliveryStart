package com.awesomeapp.usernetwork

sealed class State644_17 {
    data object Loading : State644_17()
    data class Success(val data: String) : State644_17()
    data class Error(val message: String) : State644_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}