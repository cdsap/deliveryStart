package com.awesomeapp.pushcomment

sealed class State442_12 {
    data object Loading : State442_12()
    data class Success(val data: String) : State442_12()
    data class Error(val message: String) : State442_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}