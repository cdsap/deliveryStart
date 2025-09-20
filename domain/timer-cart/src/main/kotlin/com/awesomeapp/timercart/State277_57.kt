package com.awesomeapp.timercart

sealed class State277_57 {
    data object Loading : State277_57()
    data class Success(val data: String) : State277_57()
    data class Error(val message: String) : State277_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}