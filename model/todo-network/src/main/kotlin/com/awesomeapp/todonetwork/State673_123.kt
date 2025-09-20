package com.awesomeapp.todonetwork

sealed class State673_123 {
    data object Loading : State673_123()
    data class Success(val data: String) : State673_123()
    data class Error(val message: String) : State673_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}