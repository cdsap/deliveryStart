package com.awesomeapp.timercart

sealed class State277_24 {
    data object Loading : State277_24()
    data class Success(val data: String) : State277_24()
    data class Error(val message: String) : State277_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}