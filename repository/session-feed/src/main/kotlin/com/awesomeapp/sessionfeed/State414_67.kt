package com.awesomeapp.sessionfeed

sealed class State414_67 {
    data object Loading : State414_67()
    data class Success(val data: String) : State414_67()
    data class Error(val message: String) : State414_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}