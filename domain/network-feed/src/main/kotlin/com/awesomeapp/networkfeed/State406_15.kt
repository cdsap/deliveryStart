package com.awesomeapp.networkfeed

sealed class State406_15 {
    data object Loading : State406_15()
    data class Success(val data: String) : State406_15()
    data class Error(val message: String) : State406_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}