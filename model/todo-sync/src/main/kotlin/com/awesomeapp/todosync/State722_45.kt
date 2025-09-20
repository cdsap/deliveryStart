package com.awesomeapp.todosync

sealed class State722_45 {
    data object Loading : State722_45()
    data class Success(val data: String) : State722_45()
    data class Error(val message: String) : State722_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}