package com.awesomeapp.todosync

sealed class State722_24 {
    data object Loading : State722_24()
    data class Success(val data: String) : State722_24()
    data class Error(val message: String) : State722_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}