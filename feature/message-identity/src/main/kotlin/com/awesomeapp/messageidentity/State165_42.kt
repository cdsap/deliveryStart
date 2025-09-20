package com.awesomeapp.messageidentity

sealed class State165_42 {
    data object Loading : State165_42()
    data class Success(val data: String) : State165_42()
    data class Error(val message: String) : State165_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}