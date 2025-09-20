package com.awesomeapp.articlelocation

sealed class State630_21 {
    data object Loading : State630_21()
    data class Success(val data: String) : State630_21()
    data class Error(val message: String) : State630_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}