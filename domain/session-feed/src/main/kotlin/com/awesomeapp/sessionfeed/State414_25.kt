package com.awesomeapp.sessionfeed

sealed class State414_25 {
    data object Loading : State414_25()
    data class Success(val data: String) : State414_25()
    data class Error(val message: String) : State414_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}