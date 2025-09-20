package com.awesomeapp.logcomment

sealed class State466_54 {
    data object Loading : State466_54()
    data class Success(val data: String) : State466_54()
    data class Error(val message: String) : State466_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}