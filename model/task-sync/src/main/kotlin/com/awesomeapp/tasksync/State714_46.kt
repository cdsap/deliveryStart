package com.awesomeapp.tasksync

sealed class State714_46 {
    data object Loading : State714_46()
    data class Success(val data: String) : State714_46()
    data class Error(val message: String) : State714_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}