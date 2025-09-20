package com.awesomeapp.todo

sealed class State36_57 {
    data object Loading : State36_57()
    data class Success(val data: String) : State36_57()
    data class Error(val message: String) : State36_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}