package com.awesomeapp.videocomment

sealed class State485_68 {
    data object Loading : State485_68()
    data class Success(val data: String) : State485_68()
    data class Error(val message: String) : State485_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}