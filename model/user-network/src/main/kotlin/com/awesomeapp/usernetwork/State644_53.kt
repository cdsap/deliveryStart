package com.awesomeapp.usernetwork

sealed class State644_53 {
    data object Loading : State644_53()
    data class Success(val data: String) : State644_53()
    data class Error(val message: String) : State644_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}