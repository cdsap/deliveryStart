package com.awesomeapp.commentcheckout

sealed class State206_57 {
    data object Loading : State206_57()
    data class Success(val data: String) : State206_57()
    data class Error(val message: String) : State206_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}