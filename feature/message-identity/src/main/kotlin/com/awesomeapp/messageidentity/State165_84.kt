package com.awesomeapp.messageidentity

sealed class State165_84 {
    data object Loading : State165_84()
    data class Success(val data: String) : State165_84()
    data class Error(val message: String) : State165_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}