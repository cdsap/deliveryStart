package com.awesomeapp.tasklocation

sealed class State616_23 {
    data object Loading : State616_23()
    data class Success(val data: String) : State616_23()
    data class Error(val message: String) : State616_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}