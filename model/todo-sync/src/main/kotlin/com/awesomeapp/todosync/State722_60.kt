package com.awesomeapp.todosync

sealed class State722_60 {
    data object Loading : State722_60()
    data class Success(val data: String) : State722_60()
    data class Error(val message: String) : State722_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}