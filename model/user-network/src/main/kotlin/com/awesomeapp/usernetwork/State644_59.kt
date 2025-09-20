package com.awesomeapp.usernetwork

sealed class State644_59 {
    data object Loading : State644_59()
    data class Success(val data: String) : State644_59()
    data class Error(val message: String) : State644_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}