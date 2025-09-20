package com.awesomeapp.sessioncomment

sealed class State463_27 {
    data object Loading : State463_27()
    data class Success(val data: String) : State463_27()
    data class Error(val message: String) : State463_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}