package com.awesomeapp.videocomment

sealed class State485_38 {
    data object Loading : State485_38()
    data class Success(val data: String) : State485_38()
    data class Error(val message: String) : State485_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}