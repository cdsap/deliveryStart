package com.awesomeapp.todopost

sealed class State526_18 {
    data object Loading : State526_18()
    data class Success(val data: String) : State526_18()
    data class Error(val message: String) : State526_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}