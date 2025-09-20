package com.awesomeapp.todopost

sealed class State526_51 {
    data object Loading : State526_51()
    data class Success(val data: String) : State526_51()
    data class Error(val message: String) : State526_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}