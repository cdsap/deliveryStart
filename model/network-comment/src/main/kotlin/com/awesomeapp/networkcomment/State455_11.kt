package com.awesomeapp.networkcomment

sealed class State455_11 {
    data object Loading : State455_11()
    data class Success(val data: String) : State455_11()
    data class Error(val message: String) : State455_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}