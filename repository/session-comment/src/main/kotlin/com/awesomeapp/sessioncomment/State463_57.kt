package com.awesomeapp.sessioncomment

sealed class State463_57 {
    data object Loading : State463_57()
    data class Success(val data: String) : State463_57()
    data class Error(val message: String) : State463_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}