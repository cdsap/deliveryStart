package com.awesomeapp.messageidentity

sealed class State165_57 {
    data object Loading : State165_57()
    data class Success(val data: String) : State165_57()
    data class Error(val message: String) : State165_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}