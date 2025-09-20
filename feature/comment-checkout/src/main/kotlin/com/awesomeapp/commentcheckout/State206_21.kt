package com.awesomeapp.commentcheckout

sealed class State206_21 {
    data object Loading : State206_21()
    data class Success(val data: String) : State206_21()
    data class Error(val message: String) : State206_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}