package com.awesomeapp.tasksync

sealed class State714_118 {
    data object Loading : State714_118()
    data class Success(val data: String) : State714_118()
    data class Error(val message: String) : State714_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}